package com.shark.springdemo01.extension02;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * BeanFactoryPostProcessor在spring容器初始化之后触发，而且只会触发一次，
 * 触发的时机比BeanPostProcessor早
 * @author hadoop
 *
 */
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("==============" + beanFactory.getBeanDefinitionCount());
	}
}
