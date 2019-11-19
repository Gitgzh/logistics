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

import com.woniu.pojo.Logs;
import com.woniu.service.ILogsService;
import com.woniu.service.impl.LogsServiceImpl;


@RestController
@RequestMapping("logs")
public class LogsController {

	@Resource
	private LogsServiceImpl service;
	
	@PostMapping
	public void save(@RequestBody Logs logs) {
		service.save(logs);
	}
	
	@DeleteMapping("{lid}")
	public void delete(@PathVariable Integer lid) {
		service.delete(lid);
	}
	
	@PutMapping
	public void update(Logs logs) {
		service.update(logs);
	}
	
	
	@GetMapping(value="/lid")
	public Logs findOne(Integer lid) {
		return service.findOne(lid);
	}
	
	@GetMapping
	public List<Logs> findAll(){
		List<Logs> logs = service.findAll();
		return logs;
		
	}
	
	
	
}
