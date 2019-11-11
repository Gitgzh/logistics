package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.RolesMapper;
import com.woniu.pojo.Roles;
import com.woniu.service.IRolesService;


@Service
public class RolesServiceImpl implements IRolesService {

	@Autowired
	private RolesMapper mapper;
	
	@Transactional
	@Override
	public void save(Roles roles) {
		mapper.insertSelective(roles);

	}
	@Transactional
	@Override
	public void update(Roles roles) {
		mapper.updateByPrimaryKeySelective(roles);
		
	}
	
	@Transactional
	@Override
	public void delete(Integer rid) {
		mapper.deleteByPrimaryKey(rid);
		
	}
	
	@Transactional(readOnly = true)
	@Override
	public Roles findOne(Integer rid) {
		
		return mapper.selectByPrimaryKey(rid);
	}
	
	@Transactional(readOnly = true)
	@Override
	public List<Roles> findAll() {
		
		return mapper.selectByExample(null);
	}
}
