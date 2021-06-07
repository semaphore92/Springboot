package com.example.demo.domain;

public class Book {

    private Long id;

    private String title;

    private String author;

    private int price;

    public Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

}
