package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.CarsMapper;
import com.woniu.pojo.Cars;
import com.woniu.pojo.CarsExample;
import com.woniu.service.ICarsService;


@Service
public class CarsServiceImpl implements ICarsService {

	@Autowired
	private CarsMapper mapper;
	
	@Transactional
	@Override
	public void save(Cars car) {
		mapper.insertSelective(car);

	}
	@Transactional
	@Override
	public void update(Cars car) {
		mapper.updateByPrimaryKeySelective(car);
		
	}
	
	@Transactional
	@Override
	public void delete(Integer cid) {
		mapper.deleteByPrimaryKey(cid);
		
	}
	
	@Transactional(readOnly = true)
	@Override
	public Cars findOne(Integer cid) {
		
		return mapper.selectByPrimaryKey(cid);
	}
	
	@Transactional(readOnly = true)
	@Override
	public List<Cars> findAll() {
		
		return mapper.selectByExample(null);
	}
	@Override
	public List<Cars> find(CarsExample ce) {
		// TODO Auto-generated method stub
		return mapper.find(ce);
	}
}
