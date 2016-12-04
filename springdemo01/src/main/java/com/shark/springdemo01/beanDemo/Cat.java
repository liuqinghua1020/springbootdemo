package com.shark.springdemo01.beanDemo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Cat implements InitializingBean, DisposableBean {

	public void afterPropertiesSet() throws Exception {
		System.out.println("====afterPropertiesSet=====");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("======destroy======");
	}

}
