package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.UsersRolesMapper;
import com.woniu.pojo.UsersRoles;
import com.woniu.service.IUsersRolesService;


@Service
public class UsersRolesServiceImpl implements IUsersRolesService {

	@Autowired
	private UsersRolesMapper mapper;
	
	@Transactional
	@Override
	public void save(UsersRoles ur) {
		mapper.insertSelective(ur);

	}
	@Transactional
	@Override
	public void update(UsersRoles ur) {
		mapper.updateByExampleSelective(ur,null);
		
	}
	
	@Transactional
	@Override
	public void delete(Integer rid) {
		mapper.deleteByExample(null);
		
	}
	
//	@Transactional(readOnly = true)
//	@Override
//	public Roles findOne(Integer rid) {
//		
//		return mapper.selectByExample(rid);
//	}
	
	@Transactional(readOnly = true)
	@Override
	public List<UsersRoles> findAll() {
		
		return mapper.selectByExample(null);
	}
}
