package com.shark.springdemo01.extension;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Dog implements SpringContextAware {
	private ApplicationContext applicationContext;
	
	public void setApplicationContext(ApplicationContext applicationContext) {
		this.applicationContext = applicationContext;
	}
	
	public void show(){
		System.out.println("dog : " + applicationContext.getClass());
	}
}
