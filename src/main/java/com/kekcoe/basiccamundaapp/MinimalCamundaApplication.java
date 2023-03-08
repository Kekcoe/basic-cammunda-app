package com.kekcoe.basiccamundaapp;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableProcessApplication
public class MinimalCamundaApplication {
    public static void main(String... args) {
        SpringApplication.run(MinimalCamundaApplication.class, args);
    }
}
