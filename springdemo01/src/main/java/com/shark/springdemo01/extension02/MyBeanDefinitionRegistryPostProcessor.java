package com.shark.springdemo01.extension02;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

/**
 * BeanDefinitionRegistryPostProcessor可以拿到ConfigurableListableBeanFactory，BeanDefinitionRegistry两个对象
 * BeanDefinitionRegistry对象可以动态的注入bean
 * @author hadoop
 *
 */
@Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		
	}

	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		for(int i=1;i<=10;i++){
			BeanDefinitionBuilder bdb = BeanDefinitionBuilder.rootBeanDefinition(Person.class);
			bdb.addPropertyValue("name", "admin" + i);
			registry.registerBeanDefinition("person" + i, bdb.getBeanDefinition());
		}
	}

}
