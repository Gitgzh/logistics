package com.woniu.service;

import java.util.List;

import com.woniu.pojo.UsersRoles;

public interface IUsersRolesService {
	void save (UsersRoles ur);
	void update (UsersRoles ur);
	void delete (Integer urid);
//	UsersRoles findOne (Integer urid);
	List<UsersRoles> findAll ();
}
