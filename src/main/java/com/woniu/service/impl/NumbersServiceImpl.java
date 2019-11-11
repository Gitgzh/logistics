package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.NumbersMapper;
import com.woniu.pojo.Numbers;
import com.woniu.service.INumbersService;


@Service
public class NumbersServiceImpl implements INumbersService {

	@Autowired
	private NumbersMapper mapper;
	
	@Transactional
	@Override
	public void save(Numbers numbers) {
		mapper.insertSelective(numbers);

	}
	@Transactional
	@Override
	public void update(Numbers numbers) {
		mapper.updateByPrimaryKeySelective(numbers);
		
	}
	
	@Transactional
	@Override
	public void delete(Integer nid) {
		mapper.deleteByPrimaryKey(nid);
		
	}
	
	@Transactional(readOnly = true)
	@Override
	public Numbers findOne(Integer nid) {
		
		return mapper.selectByPrimaryKey(nid);
	}
	
	@Transactional(readOnly = true)
	@Override
	public List<Numbers> findAll() {
		
		return mapper.selectByExample(null);
	}
}
