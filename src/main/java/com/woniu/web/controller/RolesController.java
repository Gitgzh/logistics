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

import com.woniu.pojo.Roles;
import com.woniu.service.IRolesService;


@Controller
@RequestMapping("roles")
public class RolesController {

	@Autowired
	private IRolesService service;
	
	@PostMapping
	@ResponseBody
	public void save(@RequestBody Roles roles) {
		service.save(roles);
	}
	
	@DeleteMapping
	@ResponseBody
	public void delete(Integer rid) {
		service.delete(rid);
	}
	
	@PutMapping
	@ResponseBody
	public void update(Roles roles) {
		service.update(roles);
	}
	
	
	@GetMapping(value="/rid")
	@ResponseBody
	public Roles findOne(Integer rid) {
		return service.findOne(rid);
	}
	
	@GetMapping
	public List<Roles> findAll(){
		List<Roles> roles = service.findAll();
		return roles;
		
	}
	
	
	
}
