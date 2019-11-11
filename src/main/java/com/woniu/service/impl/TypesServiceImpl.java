package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.TypesMapper;
import com.woniu.pojo.Types;
import com.woniu.service.ITypesService;


@Service
public class TypesServiceImpl implements ITypesService {

	@Autowired
	private TypesMapper mapper;
	
	@Transactional
	@Override
	public void save(Types types) {
		mapper.insertSelective(types);

	}
	@Transactional
	@Override
	public void update(Types types) {
		mapper.updateByPrimaryKeySelective(types);
		
	}
	
	@Transactional
	@Override
	public void delete(Integer tid) {
		mapper.deleteByPrimaryKey(tid);
		
	}
	
	@Transactional(readOnly = true)
	@Override
	public Types findOne(Integer tid) {
		
		return mapper.selectByPrimaryKey(tid);
	}
	
	@Transactional(readOnly = true)
	@Override
	public List<Types> findAll() {
		
		return mapper.selectByExample(null);
	}
}
