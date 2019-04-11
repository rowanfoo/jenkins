package com.learn.nothing;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class Z {
    @GetMapping("/")
    public String hellowrold(){
        return "hello world";
    }

    @GetMapping("/name")
    public String hellowrold(String name){
        return "hello world : " +name;
    }
}





