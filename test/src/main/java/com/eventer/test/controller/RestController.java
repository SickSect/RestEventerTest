package com.eventer.test.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello, you can see me!";
    }
}
