package com.ecomerce.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary // to mark as priority
public class Desktop implements Computer{
    @Override
    public void compile() {
        System.out.println("Compiling through desktop");
    }
}
