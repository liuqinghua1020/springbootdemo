package com.shark.springboot05;

import org.springframework.context.annotation.Bean;

public class MyConfiguration {

	@Bean
	public Runnable createRunnable(){
		return () -> {};
	}
	
	@Bean
	public Runnable createRunnable2(){
		return () -> {};
	}
}
