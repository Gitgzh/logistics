package com.woniu.web.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.http.HttpResponse;
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
import org.springframework.web.bind.annotation.RestController;

import com.woniu.config.HttpUtils;
import com.woniu.pojo.Users;
import com.woniu.service.IUsersService;
import com.woniu.service.impl.UsersServiceImpl;

@RestController
@RequestMapping("users")
public class UsersController {
	@Resource
	private UsersServiceImpl service;
	
	@RequestMapping("/login")
	public void login(String account,String upwd,String smsid) {
		//if(smsid.equals("5873")) {
		Subject subject =SecurityUtils.getSubject();
		UsernamePasswordToken token=new UsernamePasswordToken(account,upwd);
		
			subject.login(token);
//		}else {
//			//验证码错误
//		}
	}
	
//	@RequestMapping("/isLogin")
//	@ResponseBody
//	public Map<String,Object> isLogin() {
//		Subject subject =SecurityUtils.getSubject();
//		
//		Map<String,Object> map=new HashMap<String,Object>();
//		map.put("isLogin", subject.isAuthenticated());
//		return map;
//	}
	
	
	@RequestMapping("/regist")
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
	public void logout() {
		Subject subject =SecurityUtils.getSubject();
		subject.logout();
	}
	
	
	@PutMapping
	public void update(@RequestBody Users user) {
		
		service.save(user);
	}
	
	@DeleteMapping("{uid}")
	public void delete(@RequestBody Integer uid) {
		
		service.delete(uid);
		
	}
	
	@GetMapping(value="/uid")
	public void findOne(@RequestBody Integer uid) {
		
		service.findOne(uid);
	}
	
	@GetMapping
	public void findAll() {
		
		service.findAll();
	}
	
	
	
	
	
	//短信验证
	@GetMapping("sms")
	@ResponseBody
	public void SMS() {
		 String host = "https://dxyzm.market.alicloudapi.com";
		    String path = "/chuangxin/dxjk";
		    String method = "POST";
		    String appcode = "d6860e2530e74980aaa2f1132b1ee894";
		    Map<String, String> headers = new HashMap<String, String>();
		    //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
		    headers.put("Authorization", "APPCODE " + appcode);
		    Map<String, String> querys = new HashMap<String, String>();
		    //测试可用默认短信模板,测试模板为专用模板不可修改,如需自定义短信内容或改动任意字符,请联系旺旺或QQ726980650进行申请
	           querys.put("content", "【创信】你的验证码是：5873，3分钟内有效！");
		    querys.put("mobile", "18565342667");//需要发送的手机号
		    Map<String, String> bodys = new HashMap<String, String>();
		    
	            try {
		    	/**
		    	* 重要提示如下:
		    	* HttpUtils请从
		    	* https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/src/main/java/com/aliyun/api/gateway/demo/util/HttpUtils.java
		    	* 下载
		    	*
		    	* 相应的依赖请参照
		    	* https://github.com/aliyun/api-gateway-demo-sign-java/blob/master/pom.xml
		    	*/
		    	HttpResponse response = HttpUtils.doPost(host, path, method, headers, querys, bodys);
		    	System.out.println(response.toString());
		    	//获取response的body
		    	//System.out.println(EntityUtils.toString(response.getEntity()));
		    } catch (Exception e) {
		    	e.printStackTrace();
		    }
	}
	
	
	
	
	
}
