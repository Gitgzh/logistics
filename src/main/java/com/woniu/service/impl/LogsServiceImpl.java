package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.LogsMapper;
import com.woniu.pojo.Logs;
import com.woniu.service.ILogsService;


@Service
public class LogsServiceImpl implements ILogsService {

	@Autowired
	private LogsMapper mapper;
	
	@Transactional
	@Override
	public void save(Logs logs) {
		mapper.insertSelective(logs);

	}
	@Transactional
	@Override
	public void update(Logs logs) {
		mapper.updateByPrimaryKeySelective(logs);
		
	}
	
	@Transactional
	@Override
	public void delete(Integer lid) {
		mapper.deleteByPrimaryKey(lid);
		
	}
	
	@Transactional(readOnly = true)
	@Override
	public Logs findOne(Integer lid) {
		
		return mapper.selectByPrimaryKey(lid);
	}
	
	@Transactional(readOnly = true)
	@Override
	public List<Logs> findAll() {
		
		return mapper.selectByExample(null);
	}
}
