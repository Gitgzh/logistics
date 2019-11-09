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

import com.woniu.pojo.Numbers;
import com.woniu.service.INumbersService;


@Controller
@RequestMapping("numbers")
public class NumbersController {

	@Autowired
	private INumbersService service;
	
	@PostMapping
	@ResponseBody
	public void save(@RequestBody Numbers numbers) {
		service.save(numbers);
	}
	
	@DeleteMapping
	@ResponseBody
	public void delete(Integer nid) {
		service.delete(nid);
	}
	
	@PutMapping
	@ResponseBody
	public void update(Numbers numbers) {
		service.update(numbers);
	}
	
	
	@GetMapping(value="/nid")
	@ResponseBody
	public Numbers findOne(Integer nid) {
		return service.findOne(nid);
	}
	
	@GetMapping
	public List<Numbers> findAll(){
		List<Numbers> numbers = service.findAll();
		return numbers;
		
	}
	
	
	
}
