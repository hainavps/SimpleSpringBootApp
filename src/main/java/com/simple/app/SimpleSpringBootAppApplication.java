package com.simple.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SimpleSpringBootAppApplication {

    @GetMapping("/message")
    public String message() {
        return "Welcome to azure portal deployment...";
    }

    public static void main(String[] args) {
        SpringApplication.run(SimpleSpringBootAppApplication.class, args);
    }

}
