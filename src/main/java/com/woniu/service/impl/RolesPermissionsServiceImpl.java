package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.RolesPermissionsMapper;
import com.woniu.pojo.RolesPermissions;
import com.woniu.service.IRolesPermissionsService;


@Service
public class RolesPermissionsServiceImpl implements IRolesPermissionsService {

	@Autowired
	private RolesPermissionsMapper mapper;
	
	@Transactional
	@Override
	public void save(RolesPermissions rp) {
		mapper.insertSelective(rp);

	}
	@Transactional
	@Override
	public void update(RolesPermissions rp) {
		mapper.updateByExampleSelective(rp,null);
		
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
	public List<RolesPermissions> findAll() {
		
		return mapper.selectByExample(null);
	}
}
