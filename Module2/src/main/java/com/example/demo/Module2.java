package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class Module2 {

	/*
	 * @Autowired HibernateTemplate ht;
	 */

	public static void main(String[] args) {

		SpringApplication.run(Module2.class, args);

	}


}
