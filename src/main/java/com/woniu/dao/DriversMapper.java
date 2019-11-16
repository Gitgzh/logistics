package com.woniu.dao;

import com.woniu.pojo.Drivers;
import com.woniu.pojo.DriversExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DriversMapper {
    long countByExample(DriversExample example);

    int deleteByExample(DriversExample example);

    int deleteByPrimaryKey(Integer did);

    int insert(Drivers record);

    int insertSelective(Drivers record);

    List<Drivers> selectByExample(DriversExample example);

    Drivers selectByPrimaryKey(Integer did);

    int updateByExampleSelective(@Param("record") Drivers record, @Param("example") DriversExample example);

    int updateByExample(@Param("record") Drivers record, @Param("example") DriversExample example);

    int updateByPrimaryKeySelective(Drivers record);

    int updateByPrimaryKey(Drivers record);
    
    List<Drivers> find(DriversExample de);
}