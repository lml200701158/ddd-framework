package com.ddd.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;

@EnableCaching
@SpringBootApplication
@ComponentScan(basePackages = {"com.ddd"})
public class DDDFrameworkApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(DDDFrameworkApiApplication.class, args);
    }
}