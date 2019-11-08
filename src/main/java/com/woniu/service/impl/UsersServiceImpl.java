package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.UsersMapper;
import com.woniu.pojo.Users;
import com.woniu.service.IUsersService;


@Service
public class UsersServiceImpl implements IUsersService {

	@Autowired
	private UsersMapper mapper;
	
	@Transactional
	@Override
	public void save(Users user) {
		mapper.insertSelective(user);

	}
	@Transactional
	@Override
	public void update(Users user) {
		mapper.updateByPrimaryKeySelective(user);
		
	}
	
	@Transactional
	@Override
	public void delete(Integer uid) {
		mapper.deleteByPrimaryKey(uid);
		
	}
	
	@Transactional(readOnly = true)
	@Override
	public Users findOne(Integer uid) {
		
		return mapper.selectByPrimaryKey(uid);
	}
	
	@Transactional(readOnly = true)
	@Override
	public List<Users> findAll() {
		
		return mapper.selectByExample(null);
	}
}
