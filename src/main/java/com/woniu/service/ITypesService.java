package com.woniu.service;

import java.util.List;

import com.woniu.pojo.Types;


public interface ITypesService {
	void save(Types Type);
	void update(Types Type);
	void delete(Integer tid);
	Types findOne(Integer tid);
	List<Types> findAll();
}
