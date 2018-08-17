package com.boot.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //开启Eureka服务提供者
public class BootManagerServiceApp {

	public static void main(String[] args) {
		SpringApplication.run(BootManagerServiceApp.class, args);
	}
}
