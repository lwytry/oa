package com.example.oawx.db.dao;

import com.example.oawx.db.pojo.TbCity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TbCityDao {
    int deleteByPrimaryKey(Integer id);

    int insert(TbCity record);

    int insertSelective(TbCity record);

    TbCity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbCity record);

    int updateByPrimaryKey(TbCity record);
}