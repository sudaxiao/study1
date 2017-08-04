package com.dfire;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	public void versionOne(){
		System.out.println("version1");
		System.out.println("version2");
		System.out.println("version2");
	}
}
