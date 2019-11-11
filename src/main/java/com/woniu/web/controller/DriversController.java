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

import com.woniu.pojo.Drivers;
import com.woniu.service.IDriversService;
import com.woniu.service.impl.DriversServiceImpl;





@Controller
@RequestMapping("drivers")
public class DriversController {

	@Autowired
	private DriversServiceImpl service;
	
	@PostMapping
	@ResponseBody
	public void save(@RequestBody Drivers drivers) {
		service.save(drivers);
	}
	
	@DeleteMapping
	@ResponseBody
	public void delete(Integer did) {
		service.delete(did);
	}
	
	@PutMapping
	@ResponseBody
	public void update(Drivers drivers) {
		service.update(drivers);
	}
	
	
	@GetMapping(value="/did")
	@ResponseBody
	public Drivers findOne(Integer did) {
		return service.findOne(did);
	}
	
	@GetMapping
	public List<Drivers> findAll(){
		List<Drivers> drivers = service.findAll();
		return drivers;
		
	}
	
	
	
}
