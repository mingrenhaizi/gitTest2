package com.ning.springboot.controller;

import com.ning.springboot.UserService.UserService;
import com.ning.springboot.DbPojo.User;
import com.ning.springboot.utils.BeanResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    UserService service;

    @RequestMapping("/login")
    public BeanResult login(HttpSession session, User page) {
        return service.login(session,page);
    }

}

