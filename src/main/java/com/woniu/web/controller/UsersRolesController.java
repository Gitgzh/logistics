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

import com.woniu.pojo.UsersRoles;
import com.woniu.service.impl.UsersRolesServiceImpl;


@RestController
@RequestMapping("usersroles")
public class UsersRolesController {

	@Resource
	private UsersRolesServiceImpl service;
	
	@PostMapping
	public void save(@RequestBody UsersRoles ur) {
		service.save(ur);
	}
	
	@DeleteMapping
	public void delete(Integer urid) {
		service.delete(urid);
	}
	
	@PutMapping
	public void update(UsersRoles ur) {
		service.update(ur);
	}
	
	
//	@GetMapping(value="/rid")
//	@ResponseBody
//	public UsersRoles findOne(Integer rid) {
//		return service.findOne(rid);
//	}
	
	@GetMapping
	public List<UsersRoles> findAll(){
		List<UsersRoles> urs = service.findAll();
		return urs;
		
	}
	
	
	
}
