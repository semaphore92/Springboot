package com.example.demo4.service;

import com.example.demo4.domain.SW_YOUTUBE_SEARCH;
import com.example.demo4.repository.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SearchService {

    @Autowired
    SearchRepository searchRepository;

    public void saveIfNullId(){

        // Test Data
        SW_YOUTUBE_SEARCH searchVo = new SW_YOUTUBE_SEARCH();
        searchVo.setSRCH_QUERY("TEST REQUEST");
        searchVo.setSRCH_CONTENT("TEST RESPONSE");

        searchRepository.save(searchVo);
    }



}
