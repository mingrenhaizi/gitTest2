package com.ning.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.util.Date;

@Controller
@RequestMapping("/")
public class HelloController {

    @RequestMapping("/superMarket")
    public String hello() {//主页跳转用
        return "index";
    }

}
