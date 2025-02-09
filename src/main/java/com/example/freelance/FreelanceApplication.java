package com.example.freelance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.freelance")
public class FreelanceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FreelanceApplication.class, args);
    }

}
