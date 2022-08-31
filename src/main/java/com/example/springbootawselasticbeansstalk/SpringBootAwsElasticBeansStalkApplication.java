package com.example.springbootawselasticbeansstalk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class SpringBootAwsElasticBeansStalkApplication {


	@GetMapping("/")
	public String display(){
		return "elastic beanstalk deployed successfully ";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAwsElasticBeansStalkApplication.class, args);
	}

}
