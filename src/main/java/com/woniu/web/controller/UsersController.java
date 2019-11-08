package com.woniu.web.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.woniu.pojo.Users;
import com.woniu.service.IUsersService;

@Controller
@RequestMapping("users")
public class UsersController {
	@Autowired
	private IUsersService service;
	
	@RequestMapping("/login")
	@ResponseBody
	public void login(String account,String upwd) {
		Subject subject =SecurityUtils.getSubject();
		UsernamePasswordToken token=new UsernamePasswordToken(account,upwd);
		try {
			subject.login(token);
			System.out.println("认证成功");
		} catch (AuthenticationException e) {
			System.out.println("认证失败");
		}
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
}
