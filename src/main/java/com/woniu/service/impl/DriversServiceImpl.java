package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.DriversMapper;
import com.woniu.pojo.Drivers;
import com.woniu.pojo.DriversExample;
import com.woniu.service.IDriversService;


@Service
public class DriversServiceImpl implements IDriversService {

	@Autowired
	private DriversMapper mapper;
	
	@Transactional
	@Override
	public void save(Drivers drivers) {
		mapper.insertSelective(drivers);

	}
	@Transactional
	@Override
	public void update(Drivers drivers) {
		mapper.updateByPrimaryKeySelective(drivers);
		
	}
	
	@Transactional
	@Override
	public void delete(Integer did) {
		mapper.deleteByPrimaryKey(did);
		
	}
	
	@Transactional(readOnly = true)
	@Override
	public Drivers findOne(Integer did) {
		
		return mapper.selectByPrimaryKey(did);
	}
	
	@Transactional(readOnly = true)
	@Override
	public List<Drivers> findAll() {
		
		return mapper.selectByExample(null);
	}
	@Override
	public Drivers find(DriversExample de) {
		// TODO Auto-generated method stub
		return mapper.find(de);
	}
}
