package com.woniu.dao;

import com.woniu.pojo.Numbers;
import com.woniu.pojo.NumbersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NumbersMapper {
    long countByExample(NumbersExample example);

    int deleteByExample(NumbersExample example);

    int deleteByPrimaryKey(Integer nid);

    int insert(Numbers record);

    int insertSelective(Numbers record);

    List<Numbers> selectByExample(NumbersExample example);

    Numbers selectByPrimaryKey(Integer nid);

    int updateByExampleSelective(@Param("record") Numbers record, @Param("example") NumbersExample example);

    int updateByExample(@Param("record") Numbers record, @Param("example") NumbersExample example);

    int updateByPrimaryKeySelective(Numbers record);

    int updateByPrimaryKey(Numbers record);
}