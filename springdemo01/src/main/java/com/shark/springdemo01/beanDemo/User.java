package com.shark.springdemo01.beanDemo;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//没有明确角色的时候使用
@Component("myUser")
public class User {
	
	//JSR-250 的注解
	@Resource
	private Car car;
	
	//JSR-330 的注解
	@Inject
	private Cat cat;

	@Override
	public String toString() {
		return "User [car=" + car + ", cat=" + cat + "]";
	}
}
