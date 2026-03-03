package com.ecomerce.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Developer implements Computer {
//    //    @Autowired //  field injection
//    private Laptop laptop;
    @Autowired
    @Qualifier("desktop")
    private Computer comp;
    // Constructor injection
//    Developer(Laptop laptop) {
//        this.laptop = laptop;
//    }

    @Override
    public void compile() {
        System.out.println("Compiling ..... 404");
    }

    public void build() {
        comp.compile();
        System.out.println("Building the awesome project");
    }
}
