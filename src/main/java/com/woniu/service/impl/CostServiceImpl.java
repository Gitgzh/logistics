package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.CostMapper;
import com.woniu.pojo.Cost;
import com.woniu.service.ICostService;


@Service
public class CostServiceImpl implements ICostService {

	@Autowired
	private CostMapper mapper;
	
	@Transactional
	@Override
	public void save(Cost cost) {
		mapper.insertSelective(cost);

	}
	@Transactional
	@Override
	public void update(Cost cost) {
		mapper.updateByPrimaryKeySelective(cost);
		
	}
	
	@Transactional
	@Override
	public void delete(Integer costid) {
		mapper.deleteByPrimaryKey(costid);
		
	}
	
	@Transactional(readOnly = true)
	@Override
	public Cost findOne(Integer costid) {
		
		return mapper.selectByPrimaryKey(costid);
	}
	
	@Transactional(readOnly = true)
	@Override
	public List<Cost> findAll() {
		
		return mapper.selectByExample(null);
	}
}
