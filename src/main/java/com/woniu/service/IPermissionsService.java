package com.woniu.service;

import java.util.List;

import com.woniu.pojo.Permissions;


public interface IPermissionsService {
	void save(Permissions Permissions);
	void update(Permissions Permissions);
	void delete(Integer pid);
	Permissions findOne(Integer pid);
	List<Permissions> findAll();
}
