package com.woniu.service;

import java.util.List;

import com.woniu.pojo.Numbers;


public interface INumbersService {
	void save(Numbers numbers);
	void update(Numbers numbers);
	void delete(Integer nid);
	Numbers findOne(Integer nid);
	List<Numbers> findAll();
}
