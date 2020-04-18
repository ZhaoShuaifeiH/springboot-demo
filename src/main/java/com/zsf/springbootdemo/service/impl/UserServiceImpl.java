package com.zsf.springbootdemo.service.impl;

import com.zsf.springbootdemo.mapper.UserMapper;
import com.zsf.springbootdemo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;


    @Override
    public String getUserName(Long id) {
        return userMapper.getUserName(id);
    }
}
