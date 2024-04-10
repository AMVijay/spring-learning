package com.amvijay.springrestapitimeout.controller;

import java.util.concurrent.Callable;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("sayHello")
    public Callable<String> sayHello(String input){
        // return "Hello ," + input;

        return new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(8000); //this will cause a timeout
                return "Hello ," + input;
            }
        };
    }
}
