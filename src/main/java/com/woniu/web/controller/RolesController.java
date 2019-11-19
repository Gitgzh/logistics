package com.woniu.web.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;
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
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.woniu.pojo.Roles;
import com.woniu.service.IRolesService;
import com.woniu.service.impl.RolesServiceImpl;


@RestController
@RequestMapping("roles")
public class RolesController {

	@Resource
	private RolesServiceImpl service;
	
	@PostMapping
	public void save(@RequestBody Roles roles) {
		service.save(roles);
	}
	
	@DeleteMapping("{rid}")
	public void delete(Integer rid) {
		service.delete(rid);
	}
	
	@PutMapping
	public void update(Roles roles) {
		service.update(roles);
	}
	
	
	@GetMapping(value="/rid")
	public Roles findOne(Integer rid) {
		return service.findOne(rid);
	}
	
	@GetMapping
	public List<Roles> findAll(){
		List<Roles> roles = service.findAll();
		return roles;
		
	}
	
	
	
}
