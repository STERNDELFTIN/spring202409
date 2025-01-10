package com.ch03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ch03.greeting.IGreet;

@SpringBootApplication
public class Ch03Application {

	public static void main(String[] args) {
		SpringApplication.run(Ch03Application.class, args)
		.getBean(Ch03Application.class)
		.execute();
	}

	@Autowired
	IGreet greet;
	
	private void execute() {
		greet.greeting();
	}
}
