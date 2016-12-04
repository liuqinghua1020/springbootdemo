package com.shark.springboot03;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootConfiguration
@Profile("prod")
public class MyConfig {

	@Bean
	public Runnable createRunnable(){
		System.out.println("=====1=====");
		return () -> {};
	}
	
	@Bean
	@Profile("test")
	public Runnable createRunnable2(){
		System.out.println("=====2=====");
		return () -> {};
	}
	
	@Bean
	@Profile("dev")
	public Runnable createRunnable3(){
		System.out.println("=====3=====");
		return () -> {};
	}
}
