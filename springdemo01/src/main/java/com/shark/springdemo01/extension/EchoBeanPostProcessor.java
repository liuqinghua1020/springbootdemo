package com.shark.springdemo01.extension;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * BeanPostProcessor会在每个bean初始化的时候，调用一次
 * 两个方法不能返回null，否则，从容器中就获取不到
 * @author hadoop
 *
 */
//@Component
public class EchoBeanPostProcessor implements BeanPostProcessor {

	/**
	 * 是在bean依赖装配（属性设置完）完成之后触发
	 * 这里可以对指定的bean做一些处理，比如说，返该对象的代理对象
	 */
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("=========postProcessBeforeInitialization=========" + bean.getClass());
		if(bean instanceof User){
			return new LogUser();
		}
		return bean;
	}

	/**
	 * 是在bean init方法执行之后触发的
	 */
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("=========postProcessAfterInitialization=========" + bean.getClass());
		return bean;
	}
}
