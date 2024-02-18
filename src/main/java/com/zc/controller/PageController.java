package com.zc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("/")
    public String hello(){
        return "index";
    }
    @RequestMapping("/add")
    public String mainPage(){
        return "add";
    }
}
