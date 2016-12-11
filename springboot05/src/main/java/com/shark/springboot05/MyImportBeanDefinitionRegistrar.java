package com.shark.springboot05;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * registerBeanDefinitions方法的参数有一个BeanDefinitionRegistry，
 * BeanDefinitionRegistry可以用来往spring容器中注入bean
 * 如此，我们就可以在registerBeanDefinitions方法里面动态的注入bean
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		BeanDefinitionBuilder bdb = BeanDefinitionBuilder.rootBeanDefinition(User.class);
		registry.registerBeanDefinition("user", bdb.getBeanDefinition());
		
		BeanDefinitionBuilder bdb2 = BeanDefinitionBuilder.rootBeanDefinition(Role.class);
		registry.registerBeanDefinition("role", bdb2.getBeanDefinition());
		
		BeanDefinitionBuilder bdb3 = BeanDefinitionBuilder.rootBeanDefinition(MyConfiguration.class);
		registry.registerBeanDefinition(MyConfiguration.class.getName(), bdb3.getBeanDefinition());
	}
}
