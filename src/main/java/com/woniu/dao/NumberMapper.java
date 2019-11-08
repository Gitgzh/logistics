package com.woniu.dao;

import com.woniu.pojo.Number;
import com.woniu.pojo.NumberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NumberMapper {
    long countByExample(NumberExample example);

    int deleteByExample(NumberExample example);

    int deleteByPrimaryKey(Integer nid);

    int insert(Number record);

    int insertSelective(Number record);

    List<Number> selectByExample(NumberExample example);

    Number selectByPrimaryKey(Integer nid);

    int updateByExampleSelective(@Param("record") Number record, @Param("example") NumberExample example);

    int updateByExample(@Param("record") Number record, @Param("example") NumberExample example);

    int updateByPrimaryKeySelective(Number record);

    int updateByPrimaryKey(Number record);
}