package com.emse.spring.faircorp.hello;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


@Service//blablabla
public class ConsoleGreetingService implements GreetingService {

    public void greet(String name){
        System.out.println(name);
    }
}
