package com.in28minutes.spring.learn_spring_framework.game;

import org.springframework.stereotype.Component;

@Component

public class SuperContraGame implements GamingConsole{
	
	public void up() {
		System.out.println("SuperContraGame jump");
	}
	
	public void down() {
		System.out.println("SuperContraGame down into a hole");
	}
	
	public void left() {
		System.out.println("SuperContraGame stop");
	}
	
	public void right() {
		System.out.println("SuperContraGame accelerate");
	}
		

}
