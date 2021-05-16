package com.example.maven.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExampleMavenDockerApplication {

    public static void main(String[] args) {
        System.out.println("inside...");
        SpringApplication.run(ExampleMavenDockerApplication.class, args);
    }

}
