package com.shark.springdemo01.extension;

import org.springframework.context.ApplicationContext;

public interface SpringContextAware {
	public void setApplicationContext(ApplicationContext applicationContext);
}
