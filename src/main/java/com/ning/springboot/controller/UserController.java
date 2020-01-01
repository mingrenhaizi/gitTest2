package com.ning.springboot.controller;

import com.ning.springboot.dao.UserDao;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    UserDao dao;

//    @RequestMapping("/login")
//    public User login(User page) {
//        User user = dao.find
//
//        return ;
//    }

}

