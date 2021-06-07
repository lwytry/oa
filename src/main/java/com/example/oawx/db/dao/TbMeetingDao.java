package com.example.oawx.db.dao;

import com.example.oawx.db.pojo.TbMeeting;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TbMeetingDao {
    int deleteByPrimaryKey(Integer id);

    int insert(TbMeeting record);

    int insertSelective(TbMeeting record);

    TbMeeting selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbMeeting record);

    int updateByPrimaryKey(TbMeeting record);
}