package com.woniu.service;

import java.util.List;

import com.woniu.pojo.RolesPermissions;

public interface IRolesPermissionsService {
	void save (RolesPermissions rp);
	void update (RolesPermissions rp);
	void delete (Integer rpid);
//	RolesPermissions findOne (Integer rpid);
	List<RolesPermissions> findAll ();
}
