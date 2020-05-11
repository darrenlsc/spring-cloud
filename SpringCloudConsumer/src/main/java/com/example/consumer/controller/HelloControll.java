package com.example.consumer.controller;

import com.example.consumer.client.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloControll {

    @Autowired
    HelloRemote helloRemote;

    @GetMapping("test")
    public String test() {
        return "test";
    }

    @GetMapping("test1")
    public String test1() {
        return helloRemote.hello("dddd");
    }

}
