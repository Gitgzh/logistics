package com.woniu.web.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.woniu.pojo.Cars;
import com.woniu.service.ICarsService;


@Controller
@RequestMapping("cars")
public class CarsController {

	@Autowired
	private ICarsService service;
	
	@PostMapping
	@ResponseBody
	public void save(@RequestBody Cars car) {
		service.save(car);
	}
	
	@DeleteMapping
	@ResponseBody
	public void delete(Integer cid) {
		service.delete(cid);
	}
	
	@PutMapping
	@ResponseBody
	public void update(Cars car) {
		service.update(car);
	}
	
	
	@GetMapping(value="/cid")
	@ResponseBody
	public Cars findOne(Integer cid) {
		return service.findOne(cid);
	}
	
	@GetMapping
	public List<Cars> findAll(){
		List<Cars> cars = service.findAll();
		return cars;
		
	}
	
	
	
}
