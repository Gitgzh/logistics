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

import com.woniu.pojo.Permissions;
import com.woniu.service.IPermissionsService;
import com.woniu.service.impl.PermissionsServiceImpl;


@Controller
@RequestMapping("permissions")
public class PermissionsController {

	@Autowired
	private PermissionsServiceImpl service;
	
	@PostMapping
	@ResponseBody
	public void save(@RequestBody Permissions permissions) {
		service.save(permissions);
	}
	
	@DeleteMapping
	@ResponseBody
	public void delete(Integer pid) {
		service.delete(pid);
	}
	
	@PutMapping
	@ResponseBody
	public void update(Permissions permissions) {
		service.update(permissions);
	}
	
	
	@GetMapping(value="/pid")
	@ResponseBody
	public Permissions findOne(Integer pid) {
		return service.findOne(pid);
	}
	
	@GetMapping
	public List<Permissions> findAll(){
		List<Permissions> permissions = service.findAll();
		return permissions;
		
	}
	
	
	
}
