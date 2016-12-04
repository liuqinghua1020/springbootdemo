package com.shark.springdemo01.extension;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * spring4.3新特性
 * 需要注意：
 * 1：构造函数只能有一个，如果有多个的话，就必须有一个无参的构造函数，此时，spring会调用无参的构造函数
 * 2：构造函数的参数，必须都要在Spring容器中有
 * @author hadoop
 *
 */
@Component
public class Bank {

	private ApplicationContext applicationContext;

	public Bank(ApplicationContext applicationContext, User user){
		this.applicationContext = applicationContext;
	}
	public void show(){
		System.out.println("bank : " + applicationContext.getClass());
	}
}
