package com.example.demo4.controller;

import com.example.demo4.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("home")
public class HomeController {

    @Autowired
    SearchService searchService;

    @RequestMapping("index")
    public String home(){

        System.out.println("Home 진입");
        searchService.saveIfNullId();

        return "hello";
    }


}
