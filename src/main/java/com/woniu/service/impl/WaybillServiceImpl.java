package com.woniu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniu.dao.WaybillMapper;
import com.woniu.pojo.Waybill;
import com.woniu.service.IWaybillService;

@Service
public class WaybillServiceImpl implements IWaybillService {
	
	@Autowired
	private WaybillMapper waybillMapper;
	
	@Transactional
	@Override
	public void save(Waybill waybill) {
		waybillMapper.insertSelective(waybill);

	}
	@Transactional
	@Override
	public void update(Waybill waybill) {
		waybillMapper.updateByPrimaryKeySelective(waybill);

	}
	@Transactional
	@Override
	public void delete(Integer wid) {
		waybillMapper.deleteByPrimaryKey(wid);

	}
	@Transactional(readOnly = true)
	@Override
	public Waybill findOne(Integer wid) {
		
		return waybillMapper.selectByPrimaryKey(wid);
	}
	
	@Transactional(readOnly = true)
	@Override
	public List<Waybill> findAll() {
		
		return waybillMapper.selectByExample(null);
	}

}
