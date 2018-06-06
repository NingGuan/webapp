package com.guanning.web.mapper;

import com.guanning.web.vo.Pid;

public interface PidMapper {
    int deleteByPrimaryKey(String id);

    int insert(Pid record);

    int insertSelective(Pid record);

    Pid selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Pid record);

    int updateByPrimaryKey(Pid record);
}