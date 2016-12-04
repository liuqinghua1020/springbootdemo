package com.shark.springboot01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class App2 {

	@Bean
	public Runnable createRunnable(){
		return () -> {System.out.println("spring boot is run");};
	}
}
