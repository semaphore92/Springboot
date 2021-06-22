package com.example.demo2.domain;

import javax.persistence.*;

@Entity
@Table(name="SW_BOOK")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String title;

    @Column
    private String author;

    @Column
    private int price;
}
