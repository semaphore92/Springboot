package com.example.demo3.controller;

import com.example.demo3.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("home")
public class HomeController {

    @RequestMapping("/index")
    public String home(){
        System.out.println("진입");

        return "hello";
    }


}
