package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.FleetsMapper;
import com.woniu.pojo.Fleets;
import com.woniu.pojo.FleetsExample;
import com.woniu.service.IFleetsService;


@Service
public class FleetsServiceImpl implements IFleetsService {

	@Autowired
	private FleetsMapper mapper;
	
	@Transactional
	@Override
	public void save(Fleets fleets) {
		mapper.insertSelective(fleets);

	}
	@Transactional
	@Override
	public void update(Fleets fleets) {
		mapper.updateByPrimaryKeySelective(fleets);
		
	}
	
	@Transactional
	@Override
	public void delete(Integer fid) {
		mapper.deleteByPrimaryKey(fid);
		
	}
	
	@Transactional(readOnly = true)
	@Override
	public Fleets findOne(Integer fid) {
		
		return mapper.selectByPrimaryKey(fid);
	}
	
	@Transactional(readOnly = true)
	@Override
	public List<Fleets> findAll() {
		
		return mapper.selectByExample(null);
	}
	@Override
	public Fleets find(FleetsExample fe) {
		// TODO Auto-generated method stub
		return mapper.find(fe);
	}
}
