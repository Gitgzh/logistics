package com.woniu.service;

import java.util.List;

import com.woniu.pojo.Cost;




public interface ICostService {
	void save(Cost cost);
	void update(Cost cost);
	void delete(Integer costid);
	Cost findOne(Integer costid);
	List<Cost> findAll();
}
