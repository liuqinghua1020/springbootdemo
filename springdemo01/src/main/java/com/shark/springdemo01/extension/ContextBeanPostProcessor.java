package com.shark.springdemo01.extension;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * bean的后置处理器
 * @author hadoop
 *
 */
@Component
public class ContextBeanPostProcessor implements BeanPostProcessor {

	@Autowired
	private ApplicationContext applicationContext;
	
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if(bean instanceof SpringContextAware){
			SpringContextAware sca = (SpringContextAware)bean;
			sca.setApplicationContext(applicationContext);
		}
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		return bean;
	}

}
