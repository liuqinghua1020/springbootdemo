package com.shark.springboot04;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;


@SpringBootConfiguration
public class UserConfiguration {

	/**
	 * 表示，某个属性等于某个值的时候，才装配
	 * @return
	 */
	@Bean
	@ConditionalOnProperty(name = "runnable.enabled", havingValue="true", matchIfMissing=true)
	public Runnable createRunnable(){
		return () -> {};
	}
	
	/**
	 * 表示classpath中是否存在某个class的时候才装配
	 * @ConditionalOnClass 存在
	 * @ConditionalOnMissingClass 不存在
	 * @return
	 */
	@Bean
	@ConditionalOnClass(name = "com.google.gson.Gson")
	public Runnable createGsonRunnable(){
		return () -> {};
	}
	
	/**
	 * 根据容器中存在是否存在某个bean来进行装配
	 * @ConditionalOnMissingBean 不存在
	 * @ConditionalOnBean 存在
	 * @return
	 */
	@Bean
	@ConditionalOnBean(name="user")
	public Runnable createBeanRunnable(){
		return () -> {};
	} 
}
