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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.woniu.pojo.Waybill;
import com.woniu.service.IWaybillService;
import com.woniu.service.impl.WaybillServiceImpl;


@Controller
@RequestMapping("waybill")
public class WaybillController {

	@Autowired
	private WaybillServiceImpl service;
	
	@PostMapping
	@ResponseBody
	public void save(@RequestBody Waybill waybill) {
		service.save(waybill);
	}
	
	@DeleteMapping("{wid}")
	@ResponseBody
	public void delete(@PathVariable Integer wid) {
		service.delete(wid);
	}
	
	@PutMapping
	@ResponseBody
	public void update(Waybill waybill) {
		service.update(waybill);
	}
	
	
	@GetMapping(value="/wid")
	@ResponseBody
	public Waybill findOne(Integer wid) {
		return service.findOne(wid);
	}
	
	@GetMapping
	public List<Waybill> findAll(){
		List<Waybill> waybill = service.findAll();
		return waybill;
		
	}
	
	
	
}
