package com.imooc.mvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Thpffcj on 2017/7/15.
 */
@Controller
@RequestMapping("/hello")
public class HelloMvcController {

    @RequestMapping("/mvc")
    //host:8080/hello/mvc
    public String helloMvc(){
        return "home";
    }
}
