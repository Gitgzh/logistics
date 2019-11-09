package com.woniu.service;

import java.util.List;

import com.woniu.pojo.Logs;

public interface ILogsService {
	void save(Logs logs);
	void update(Logs logs);
	void delete(Integer lid);
	Logs findOne(Integer lid);
	List<Logs> findAll();
}
