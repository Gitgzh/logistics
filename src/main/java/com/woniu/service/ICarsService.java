package com.woniu.service;

import java.util.List;

import com.woniu.pojo.Cars;
import com.woniu.pojo.CarsExample;



public interface ICarsService {
	void save(Cars car);
	void update(Cars car);
	void delete(Integer cid);
	Cars findOne(Integer cid);
	List<Cars> findAll();
	Cars find(CarsExample ce);
}
