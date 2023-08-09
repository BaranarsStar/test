package com.resoft.test.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class HelloWorld {

    @RequestMapping(value = "get")
    public String getHelloWorld(){

        return "HelloWorld!";

    }

}
