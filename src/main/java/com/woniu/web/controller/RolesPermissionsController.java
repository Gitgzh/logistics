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

import com.woniu.pojo.RolesPermissions;
import com.woniu.service.impl.RolesPermissionsServiceImpl;


@RestController
@RequestMapping("rolespermissions")
public class RolesPermissionsController {

	@Resource
	private RolesPermissionsServiceImpl service;
	
	@PostMapping
	public void save(@RequestBody RolesPermissions rp) {
		service.save(rp);
	}
	
	@DeleteMapping
	public void delete(Integer rpid) {
		service.delete(rpid);
	}
	
	@PutMapping
	public void update(RolesPermissions rp) {
		service.update(rp);
	}
	
	
//	@GetMapping(value="/rid")
//	@ResponseBody
//	public RolesPermissions findOne(Integer rid) {
//		return service.findOne(rid);
//	}
	
	@GetMapping
	public List<RolesPermissions> findAll(){
		List<RolesPermissions> rps = service.findAll();
		return rps;
		
	}
	
	
	
}
