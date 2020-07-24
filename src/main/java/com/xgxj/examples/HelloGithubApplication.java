package com.xgxj.examples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class HelloGithubApplication {

	public static void main(String[] args) {
		System.out.println("<---------------------started------------------->");
		SpringApplication.run(HelloGithubApplication.class, args);
	}

}
