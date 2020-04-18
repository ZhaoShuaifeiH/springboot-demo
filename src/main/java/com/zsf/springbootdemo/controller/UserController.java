package com.zsf.springbootdemo.controller;

import com.zsf.springbootdemo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/getUserName")
    @ResponseBody
    public String getUserName(@RequestParam String id){
        return userService.getUserName(Long.parseLong(id));
    }
}
