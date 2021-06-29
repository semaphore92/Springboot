package com.example.demo3.service;

import com.example.demo3.domain.Book;
import com.example.demo3.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public void findByTitle(String title){
        List<Book> bookList = new ArrayList<Book>();
        bookList = bookRepository.findByTitle(title);

        for (Book book: bookList) {
            System.out.println(book.toString());
        }
    }

}