package com.ch03.greeting;

import org.springframework.stereotype.Component;

@Component
public class EveningGreet implements IGreet {

	@Override
	public void greeting() {
		System.out.println("Good Evening!");
	}


}
