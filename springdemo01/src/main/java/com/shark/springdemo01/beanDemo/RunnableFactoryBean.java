package com.shark.springdemo01.beanDemo;

import org.springframework.beans.factory.FactoryBean;

public class RunnableFactoryBean implements FactoryBean<Jeep> {

	public Jeep getObject() throws Exception {
		return new Jeep();
	}

	public Class<?> getObjectType() {
		return Jeep.class;
	}

	public boolean isSingleton() {
		return false;
	}
}
