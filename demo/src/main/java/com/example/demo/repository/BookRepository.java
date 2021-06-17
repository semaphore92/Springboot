package com.example.demo.repository;

import com.example.demo.domain.SW_Book;
import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository; 
import java.util.List; 

@Repository 
public interface BookRepository extends JpaRepository<SW_Book, Long> { 
    
    SW_Book findByTitle(String title); 
    
}
