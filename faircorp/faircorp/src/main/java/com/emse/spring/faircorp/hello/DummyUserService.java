package com.emse.spring.faircorp.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class DummyUserService implements UserService {
    @Autowired
    private GreetingService greetingService;

    public void greetAll(){
        ArrayList<String> liste = new ArrayList(2);
        liste.add("Elodie");
        liste.add("Charles");
        for(int i=0 ;i<2 ;i++){
            greetingService.greet(liste.get(i));
        }


    }
}
