package com.amvijay.springrestapitimeout.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("sayHello")
    public String sayHello(String input){
        return "Hello ," + input;
    }
}
