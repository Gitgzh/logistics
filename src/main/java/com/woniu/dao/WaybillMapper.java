package com.woniu.dao;

import com.woniu.pojo.Waybill;
import com.woniu.pojo.WaybillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WaybillMapper {
    long countByExample(WaybillExample example);

    int deleteByExample(WaybillExample example);

    int deleteByPrimaryKey(Integer wid);

    int insert(Waybill record);

    int insertSelective(Waybill record);

    List<Waybill> selectByExample(WaybillExample example);

    Waybill selectByPrimaryKey(Integer wid);

    int updateByExampleSelective(@Param("record") Waybill record, @Param("example") WaybillExample example);

    int updateByExample(@Param("record") Waybill record, @Param("example") WaybillExample example);

    int updateByPrimaryKeySelective(Waybill record);

    int updateByPrimaryKey(Waybill record);
}