package com.zsf.springbootdemo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    public String getUserName(@Param("id")Long id);
}
