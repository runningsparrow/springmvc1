package com.sparrow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HelloController {

    @RequestMapping(value = "/")
    public String index(){

        System.out.println(" index ");
        return "index";
    }

    @RequestMapping(value = "/hello")
    public String hello(){

        System.out.println(" hello");
        return "hello";

    }

}
