package com.woniu.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("tests")
public class TestContronller {

	@GetMapping
	@ResponseBody
	public void save() {
		System.out.println("UserController.save()");
	}
}
