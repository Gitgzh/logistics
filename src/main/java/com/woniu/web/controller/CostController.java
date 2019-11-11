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

import com.woniu.pojo.Cost;
import com.woniu.service.ICostService;
import com.woniu.service.impl.CostServiceImpl;



@Controller
@RequestMapping("cost")
public class CostController {

	@Autowired
	private CostServiceImpl service;
	
	@PostMapping
	@ResponseBody
	public void save(@RequestBody Cost cost) {
		service.save(cost);
	}
	
	@DeleteMapping
	@ResponseBody
	public void delete(Integer costid) {
		service.delete(costid);
	}
	
	@PutMapping
	@ResponseBody
	public void update(Cost cost) {
		service.update(cost);
	}
	
	
	@GetMapping(value="/costid")
	@ResponseBody
	public Cost findOne(Integer costid) {
		return service.findOne(costid);
	}
	
	@GetMapping
	public List<Cost> findAll(){
		List<Cost> costs = service.findAll();
		return costs;
		
	}
	
	
	
}
