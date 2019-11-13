
package com.woniu.web.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.woniu.pojo.Cars;
import com.woniu.pojo.CarsExample;
import com.woniu.service.impl.CarsServiceImpl;


@RestController
@RequestMapping("cars")
public class CarsController {

	@Autowired
	private CarsServiceImpl service;
	
	//多个图片
	@PostMapping
	public void save(Cars car,@RequestParam CommonsMultipartFile[] photo,HttpServletRequest req) { 
		StringBuilder s = new StringBuilder();
		for(int i=0;i<photo.length;i++) {
			//后缀
			String OldName = photo[i].getOriginalFilename();
			int lastDot = OldName.lastIndexOf(".");
			String ext = OldName.substring(lastDot); 
			//文件名
			String newName = UUID.randomUUID().toString().replace("-", "")+ext;
			//上传路径
			String path = req.getServletContext().getRealPath("/images");
			
			try {
				photo[i].transferTo(new File(path,newName));
				
				//数据入库
				s.append(newName);
				s.append(",");
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		s.deleteCharAt(s.length()-1);
		car.setCphoto(s.toString());
		service.save(car);
	}
	
	@DeleteMapping
	public void delete(Integer cid,HttpServletRequest req) {
		//首先删除车辆照片
		Cars c = service.findOne(cid);
		String photo = c.getCphoto();
		//文件夹和添加名称相同
		String path = req.getServletContext().getRealPath("/images");
		File image = new File(path,photo);
		image.delete();
		
		//通过id删除所有
		service.delete(cid);
	}
	
	@PutMapping
	public void update(Cars car) {
		
		service.update(car);
	}
	
	
	@GetMapping(value="/cid")
	public Cars findOne(Integer cid) {
		return service.findOne(cid);
	}
	
	@GetMapping
	public List<Cars> findAll(){
		List<Cars> cars = service.findAll();
		return cars;
		
	}
	
	//按条件查询   按车牌号码查询、按车辆类型查询、按车辆载重查询、按车辆使用状态查询、按车辆所属车队查询
	
	public Cars find(CarsExample ce) {
		System.out.println("CarsController.find()");
		return service.find(ce);
	}
	
}

