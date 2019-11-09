package com.woniu.service;

import java.util.List;

import com.woniu.pojo.Fleets;



public interface IFleetsService {
	void save(Fleets fleets);
	void update(Fleets fleets);
	void delete(Integer fid);
	Fleets findOne(Integer fid);
	List<Fleets> findAll();
}
