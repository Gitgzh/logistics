package com.woniu.service;

import java.util.List;

import com.woniu.pojo.Drivers;
import com.woniu.pojo.DriversExample;


public interface IDriversService {
	void save(Drivers drivers);
	void update(Drivers drivers);
	void delete(Integer did);
	Drivers findOne(Integer did);
	List<Drivers> findAll();
	List<Drivers> find(DriversExample de);
}
