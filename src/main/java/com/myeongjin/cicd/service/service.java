package com.myeongjin.cicd.service;

import com.myeongjin.cicd.repository.HomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class service {

    @Autowired
    private HomeRepository homeRepository;

    public String getHomeMessage() {
        return homeRepository.getHomeMessage();
    }
}