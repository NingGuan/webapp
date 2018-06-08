package com.guanning.web.mapper;

import com.guanning.web.vo.Pid;
import org.springframework.stereotype.Component;

@Component
public interface PidMapper {
    int deleteByPrimaryKey(String id);

    int insert(Pid record);

    int insertSelective(Pid record);

    Pid selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Pid record);

    int updateByPrimaryKey(Pid record);
}