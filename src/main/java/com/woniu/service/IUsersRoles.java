package com.woniu.service;

import java.util.List;

import com.woniu.pojo.UsersRoles;


public interface IUsersRoles {

	void save(UsersRoles ur);
	void update(UsersRoles ur);
	void delete(Integer uid);
	UsersRoles findOne(Integer uid);
	List<UsersRoles> findAll();
}
