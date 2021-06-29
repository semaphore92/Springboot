package com.example.demo3.repository;

import com.example.demo3.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    public List<Book> findByTitle(String title);
}
