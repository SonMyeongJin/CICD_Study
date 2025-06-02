package com.myeongjin.cicd.controller;

import com.myeongjin.cicd.service.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @Autowired
    private service myService;

    @GetMapping("/home")
    public String home() {
        return myService.getHomeMessage();
    }
}
