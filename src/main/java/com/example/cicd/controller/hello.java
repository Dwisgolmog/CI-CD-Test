package com.example.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {

    @GetMapping("/test")
    public String test(){
        return "커밋 후 CI/CD 작동 확인!";
    }
}
