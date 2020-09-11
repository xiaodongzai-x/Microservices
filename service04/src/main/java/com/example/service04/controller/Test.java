package com.example.service04.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * User: xiao
 * Date: 2020/9/9
 */
@RestController
public class Test {
    @RequestMapping("/service2")
    public String test01(){
        return "服务4";
    }
}
