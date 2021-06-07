package com.example.oawx.db.dao;

import com.example.oawx.db.pojo.TbModule;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TbModuleDao {
    int deleteByPrimaryKey(Integer id);

    int insert(TbModule record);

    int insertSelective(TbModule record);

    TbModule selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbModule record);

    int updateByPrimaryKey(TbModule record);
}