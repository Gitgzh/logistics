package com.woniu.service;

import java.util.List;

import com.woniu.pojo.Users;

public interface IUsersService {
	void save(Users user);
	void update(Users user);
	void delete(Integer uid);
	Users findOne(Integer uid);
	List<Users> findAll();
}
