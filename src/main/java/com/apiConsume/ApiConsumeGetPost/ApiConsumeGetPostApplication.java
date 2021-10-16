package com.apiConsume.ApiConsumeGetPost;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ApiConsumeGetPostApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiConsumeGetPostApplication.class, args);
	}
	@Bean
	RestTemplate restTemplate()
	{
		return new RestTemplate();
	}

}
