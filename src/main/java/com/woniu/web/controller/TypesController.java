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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.woniu.pojo.Types;
import com.woniu.service.ITypesService;
import com.woniu.service.impl.TypesServiceImpl;


@RestController
@RequestMapping("types")
public class TypesController {

	@Resource
	private TypesServiceImpl service;
	
	@PostMapping
	public void save(@RequestBody Types type) {
		service.save(type);
	}
	
	@DeleteMapping("{tid}")
	public void delete(@PathVariable Integer tid) {
		service.delete(tid);
	}
	
	@PutMapping
	public void update(Types type) {
		service.update(type);
	}
	
	
	@GetMapping(value="/tid")
	public Types findOne(Integer tid) {
		return service.findOne(tid);
	}
	
	@GetMapping
	public List<Types> findAll(){
		List<Types> types = service.findAll();
		return types;
		
	}
	
	
	
}
