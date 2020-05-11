package com.controll;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("hello")
public class HelloControll {

    @Value("${neo.hello}")
    private String hello;

    @GetMapping("test")
    @ResponseBody
    public String test(@RequestParam String name) {
        System.out.println("ddddd");
        return this.hello;
    }

}
