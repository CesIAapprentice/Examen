package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@ComponentScan
//@EntityScan("com.example.demo.model")
//@EnableJpaRepositories("com.example.demo.repository")
	public class ExamenApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ExamenApplication.class, args);
    }
}
