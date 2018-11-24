package com.emse.spring.faircorp;

import com.emse.spring.faircorp.hello.ConsoleGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration// (1)
public class FaircorpApplicationConfig {
    @Autowired
    ConsoleGreetingService greetingService;

    @Bean // (2)
    public CommandLineRunner greetingCommandLine() {
        // (3)

        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                greetingService.greet("Hello Spring!");// (4)
            }
        };
    }
}

