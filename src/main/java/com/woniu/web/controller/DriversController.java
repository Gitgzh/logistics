package com.woniu.web.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.woniu.pojo.Drivers;
import com.woniu.pojo.DriversExample;
import com.woniu.service.impl.DriversServiceImpl;





@RestController
@RequestMapping("drivers")
public class DriversController {

	@Autowired
	private DriversServiceImpl service;
	
	@PostMapping
	public void save(Drivers drivers,@RequestParam CommonsMultipartFile photo[],HttpServletRequest req) {
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
		drivers.setDphoto(s.toString());
		service.save(drivers);
	}
	
	@DeleteMapping
	public void delete(Integer did,HttpServletRequest req) {
		//首先删除车辆照片
		Drivers d = service.findOne(did);
		String photo = d.getDphoto();
		//文件夹和添加名称相同
		String path = req.getServletContext().getRealPath("/images");
		File image = new File(path,photo);
		image.delete();
		
		//通过id删除所有
		service.delete(did);
	}
	
	@PutMapping
	public void update(Drivers drivers) {
		service.update(drivers);
	}
	
	
	@GetMapping(value="/did")
	public Drivers findOne(Integer did) {
		return service.findOne(did);
	}
	
	@GetMapping
	public List<Drivers> findAll(){
		List<Drivers> drivers = service.findAll();
		return drivers;
		
	}
	
	public Drivers find(DriversExample de) {
		return service.find(de);
	}
	
}
