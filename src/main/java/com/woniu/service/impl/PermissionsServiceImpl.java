package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.PermissionsMapper;
import com.woniu.pojo.Permissions;
import com.woniu.service.IPermissionsService;


@Service
public class PermissionsServiceImpl implements IPermissionsService {

	@Autowired
	private PermissionsMapper mapper;
	
	@Transactional
	@Override
	public void save(Permissions permissions) {
		mapper.insertSelective(permissions);

	}
	@Transactional
	@Override
	public void update(Permissions permissions) {
		mapper.updateByPrimaryKeySelective(permissions);
		
	}
	
	@Transactional
	@Override
	public void delete(Integer pid) {
		mapper.deleteByPrimaryKey(pid);
		
	}
	
	@Transactional(readOnly = true)
	@Override
	public Permissions findOne(Integer pid) {
		
		return mapper.selectByPrimaryKey(pid);
	}
	
	@Transactional(readOnly = true)
	@Override
	public List<Permissions> findAll() {
		
		return mapper.selectByExample(null);
	}
}
