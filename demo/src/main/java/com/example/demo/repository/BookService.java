package com.example.demo.repository;

import org.springframework.stereotype.Service;
import com.example.demo.domain.SW_Book;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class BookService { 
    
    @Autowired
    private BookRepository bookRepository;

    public void test(){
        SW_Book book = bookRepository.findByTitle("해리포터");
        System.out.println(book.toString());
    }
    
}
