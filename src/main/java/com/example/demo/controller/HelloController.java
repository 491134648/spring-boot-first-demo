package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
* @RestController 表示一个RestController的注解
* */
@RestController
public class HelloController {
    /*
    * @RequestMapping 路由映射的注解
    * */
    @RequestMapping("/hello")
    public  String Hello(){
        return "Hello World";
    }
}
