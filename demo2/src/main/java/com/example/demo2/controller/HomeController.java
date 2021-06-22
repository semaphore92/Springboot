package com.example.demo2.controller;

import com.example.demo2.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {

    @Autowired
    BookService bookService;

    @RequestMapping("/index")
    public String home(){
        System.out.println("진입");
        bookService.findByTitle("해리포터");
        return "hello";
    }


}
