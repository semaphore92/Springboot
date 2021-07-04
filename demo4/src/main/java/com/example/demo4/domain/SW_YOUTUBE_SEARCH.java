package com.example.demo4.domain;

import lombok.Data;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity(name="swYoutubeSearch")
public class SW_YOUTUBE_SEARCH {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long SRCH_NO;

    private String SRCH_QUERY;

    private String SRCH_CONTENT;

    private Date SRCH_DATE;


}
