package com.woniu.service;

import java.util.List;

import com.woniu.pojo.Waybill;

public interface IWaybillService {
	void save (Waybill waybill);
	void update (Waybill waybill);
	void delete (Integer wid);
	Waybill findOne (Integer wid);
	List<Waybill> findAll ();
}
