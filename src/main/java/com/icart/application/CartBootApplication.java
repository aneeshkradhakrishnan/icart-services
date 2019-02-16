package com.icart.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.icart.components"})
@EnableAutoConfiguration
public class CartBootApplication {

    public static void main(String... args) {
        SpringApplication.run(CartBootApplication.class, args);
    }
}
