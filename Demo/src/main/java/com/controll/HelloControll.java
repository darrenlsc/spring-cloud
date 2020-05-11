package com.controll;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("hello")
public class HelloControll {

    @GetMapping("test")
    @ResponseBody
    public String test(@RequestParam String name) {
        System.out.println("ddddd");
        return "test";
    }

}
