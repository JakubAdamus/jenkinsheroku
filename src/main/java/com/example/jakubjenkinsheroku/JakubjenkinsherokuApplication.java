package com.example.jakubjenkinsheroku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class JakubjenkinsherokuApplication {

    public static void main(String[] args) {
        SpringApplication.run(JakubjenkinsherokuApplication.class, args);
    }


    @GetMapping
    public String get() {
        return "Hello Jenkins";
    }
}
