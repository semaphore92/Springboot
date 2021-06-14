package com.example.demo.domain;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="member")
public class Book {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column
    private String title;

    @Column
    private String author;

    private int price;

    public Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

}
