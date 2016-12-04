package com.shark.springdemo01.beanDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyConfig {

	@Bean(initMethod="init", destroyMethod="destroy")
	public Dog createDog(){
		return new Dog();
	}
	
	@Bean
	public CarFactory createJeepFactory(){
		return new CarFactory();
	}
	
	@Bean(name = "myBean")
	@Scope("prototype")
	public MyBean createMyBean() {
		return new MyBean();
	}
	
	@Bean
	public RunnableFactoryBean createRunnableFactoryBean(){
		return new RunnableFactoryBean();
	}
	
	@Bean
	public Car createCar(CarFactory factory){
		return factory.create();
	}
	
	@Bean
	public Cat createCat(){
		return new Cat();
	}
	
	@Bean
	public Animal createAnimal(){
		return new Animal();
	}
	
	@Bean
	public User createUser(){
		return new User();
	}
}
