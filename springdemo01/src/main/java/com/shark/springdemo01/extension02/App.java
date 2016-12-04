package com.shark.springdemo01.extension02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.shark.springdemo01.extension02");
		context.getBeansOfType(Person.class).values().forEach(System.out::println);
		context.close();
	}
}
