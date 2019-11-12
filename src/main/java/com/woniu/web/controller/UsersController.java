package com.woniu.web.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.woniu.pojo.Users;
import com.woniu.service.IUsersService;
import com.woniu.service.impl.UsersServiceImpl;

@Controller
@RequestMapping("users")
public class UsersController {
	@Autowired
	private UsersServiceImpl service;
	
	@RequestMapping("/login")
	@ResponseBody
	public void login(String account,String upwd) {
		Subject subject =SecurityUtils.getSubject();
		UsernamePasswordToken token=new UsernamePasswordToken(account,upwd);
		
			subject.login(token);
			
	}
	
	@RequestMapping("/isLogin")
	@ResponseBody
	public Map<String,Object> isLogin() {
		Subject subject =SecurityUtils.getSubject();
		
		Map<String,Object> map=new HashMap<>();
		map.put("isLogin", subject.isAuthenticated());
		return map;
	}
	
	
	@RequestMapping("/regist")
	@ResponseBody
	public void regist(@RequestBody Users user) {
		String str=user.getUpwd();
		String salt="abc";
		SimpleHash sh=new SimpleHash("md5",str,salt,1024);
		String upwd =sh.toHex();
		user.setUpwd(upwd);
		user.setSalt(salt);
		service.save(user);
	}
	
	@RequestMapping("/logout")
	@ResponseBody
	public void logout() {
		Subject subject =SecurityUtils.getSubject();
		subject.logout();
	}
	
	
	@PutMapping
	@ResponseBody
	public void update(@RequestBody Users user) {
		
		service.save(user);
	}
	
	@DeleteMapping
	@ResponseBody
	public void delete(@RequestBody Integer uid) {
		
		service.delete(uid);
		
	}
	
	@GetMapping(value="/uid")
	@ResponseBody
	public void findOne(@RequestBody Integer uid) {
		
		service.findOne(uid);
	}
	
	@GetMapping
	@ResponseBody
	public void findAll() {
		
		service.findAll();
	}
}
