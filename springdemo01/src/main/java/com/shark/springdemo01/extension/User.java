package com.shark.springdemo01.extension;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class User {
	
	private ApplicationContext applicationContext;
	
	public void init(){
		System.out.println("user init ");
	}
	
	public void show(){
		System.out.println("user : " + applicationContext);
	}

	@Autowired
	public void setApplicationContext(ApplicationContext applicationContext) {
		this.applicationContext = applicationContext;
		System.out.println("==========set");
	}
}
