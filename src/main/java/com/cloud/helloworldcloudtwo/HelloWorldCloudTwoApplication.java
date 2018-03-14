package com.cloud.helloworldcloudtwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class HelloWorldCloudTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldCloudTwoApplication.class, args);
	}
}