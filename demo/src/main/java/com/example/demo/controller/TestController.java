package com.example.demo.controller;

import com.example.demo.repository.BookRepository;
import com.example.demo.repository.BookService;

import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.ResponseBody; 
import org.springframework.beans.factory.annotation.Autowired;

@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    BookService bookService;

    @RequestMapping("/home")
	public String test(){
        bookService.test();
        return "hello";
    }

}
