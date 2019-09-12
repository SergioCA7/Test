package com.test.backend.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.test.backend.controller.TestController;
import com.test.backend.services.TestService;

@SpringBootApplication
@ComponentScan(basePackageClasses = {TestController.class,TestService.class})
public class TestApplication {
	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}

}
