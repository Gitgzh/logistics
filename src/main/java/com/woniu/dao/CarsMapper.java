package com.woniu.dao;

import com.woniu.pojo.Cars;
import com.woniu.pojo.CarsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarsMapper {
    long countByExample(CarsExample example);

    int deleteByExample(CarsExample example);

    int deleteByPrimaryKey(Integer cid);

    int insert(Cars record);

    int insertSelective(Cars record);

    List<Cars> selectByExample(CarsExample example);

    Cars selectByPrimaryKey(Integer cid);

    int updateByExampleSelective(@Param("record") Cars record, @Param("example") CarsExample example);

    int updateByExample(@Param("record") Cars record, @Param("example") CarsExample example);

    int updateByPrimaryKeySelective(Cars record);

    int updateByPrimaryKey(Cars record);
    
    List<Cars> find(CarsExample ce);
    
    //List findByFid();
}