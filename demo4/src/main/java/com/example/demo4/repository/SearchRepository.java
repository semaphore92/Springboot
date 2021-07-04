package com.example.demo4.repository;

import com.example.demo4.domain.SW_YOUTUBE_SEARCH;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SearchRepository extends JpaRepository<SW_YOUTUBE_SEARCH, Long> {

}
