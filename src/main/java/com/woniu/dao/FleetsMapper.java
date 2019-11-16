package com.woniu.dao;

import com.woniu.pojo.Cars;
import com.woniu.pojo.Fleets;
import com.woniu.pojo.FleetsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FleetsMapper {
    long countByExample(FleetsExample example);

    int deleteByExample(FleetsExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(Fleets record);

    int insertSelective(Fleets record);

    List<Fleets> selectByExample(FleetsExample example);

    Fleets selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") Fleets record, @Param("example") FleetsExample example);

    int updateByExample(@Param("record") Fleets record, @Param("example") FleetsExample example);

    int updateByPrimaryKeySelective(Fleets record);

    int updateByPrimaryKey(Fleets record);
    
    
    
    List<Fleets> find(FleetsExample fe);
    List<Cars> findByIdWithCars(Integer fid);
    
    //List findByFlF(String fname);
}