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

import com.woniu.pojo.Fleets;
import com.woniu.pojo.FleetsExample;
import com.woniu.service.IFleetsService;
import com.woniu.service.impl.FleetsServiceImpl;


@Controller
@RequestMapping("fleets")
public class FleetsController {

	@Autowired
	private FleetsServiceImpl service;
	
	@PostMapping
	@ResponseBody
	public void save(@RequestBody Fleets fleets) {
		service.save(fleets);
	}
	
	@DeleteMapping
	@ResponseBody
	public void delete(Integer fid) {
		service.delete(fid);
	}
	
	@PutMapping
	@ResponseBody
	public void update(Fleets fleets) {
		service.update(fleets);
	}
	
	
	@GetMapping(value="/fid")
	@ResponseBody
	public Fleets findOne(Integer fid) {
		return service.findOne(fid);
	}
	
	@GetMapping
	public List<Fleets> findAll(){
		List<Fleets> fleets = service.findAll();
		return fleets;
		
	}
	
	public Fleets find(FleetsExample fe) {
		return service.find(fe);
	}
	
}
