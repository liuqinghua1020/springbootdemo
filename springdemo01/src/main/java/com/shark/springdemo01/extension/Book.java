package com.shark.springdemo01.extension;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * 实现逻辑参照：ApplicationContextAwareProcessor
 * @author hadoop
 *
 */
@Component
public class Book implements ApplicationContextAware {
	private ApplicationContext applicationContext;
	
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}
	
	public void show(){
		System.out.println("book : " + applicationContext.getClass());
	}
}
