package com.example.oawx.db.dao;

import com.example.oawx.db.pojo.TbPermission;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TbPermissionDao {
    int deleteByPrimaryKey(Integer id);

    int insert(TbPermission record);

    int insertSelective(TbPermission record);

    TbPermission selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbPermission record);

    int updateByPrimaryKey(TbPermission record);
}