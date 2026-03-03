package com.ecomerce.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @RequestMapping("/")
    public String greet(){
        System.out.println("Working on this awesome project");
        return "Hello word welcome back";
    }
}
