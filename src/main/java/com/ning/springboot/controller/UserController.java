package com.ning.springboot.controller;

import com.ning.springboot.UserService.UserService;
import com.ning.springboot.DbPojo.User;
import com.ning.springboot.dao.UserDao;
import com.ning.springboot.utils.BeanResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    UserDao dao;

    @Resource
    UserService service;

    @RequestMapping("/login")
    public BeanResult login(HttpSession session, User page) {
        return service.login(session,page);
    }

    @RequestMapping("/accountExit")
    public BeanResult accountExit(String account) {
        if (dao.exists(account)){//已存在，不能注册
            return BeanResult.fail("此账号已被注册！换一个账号试试吧~");
        }
        return BeanResult.success();
    }

}

