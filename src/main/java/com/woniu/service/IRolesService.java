package com.woniu.service;

import java.util.List;


import com.woniu.pojo.Roles;


public interface IRolesService {
	void save(Roles Roles);
	void update(Roles Roles);
	void delete(Integer rid);
	Roles findOne(Integer rid);
	List<Roles> findAll();
}
