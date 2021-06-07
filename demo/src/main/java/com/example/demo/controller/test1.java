package com.example.demo.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test1{

    public static void main(String[] args) {
        
        List<String> WORDS = Arrays.asList("TONY", "a", "hULK", "B", "america", "X", "nebula", "Korea");

        Map<String,Integer> wordMap = new HashMap<>();
        WORDS.stream().map(w -> w.substring(0,1)).forEach(prefix -> System.out.println(prefix));
    }
}