package com.example.demo4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("home")
public class HomeController {

    @RequestMapping("index")
    public String home(){
        System.out.println("진입");

        return "hello";
    }


}
