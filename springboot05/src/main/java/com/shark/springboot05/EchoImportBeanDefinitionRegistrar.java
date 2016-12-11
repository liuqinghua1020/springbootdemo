package com.shark.springboot05;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class EchoImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
	
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {

		Map<String, Object> attr = importingClassMetadata.getAnnotationAttributes(EnableEcho.class.getName());
		String[] packArr = (String[])attr.get("packages");
		List<String> packages = Arrays.asList(packArr);
		System.out.println("packages : " + packages);
		
		BeanDefinitionBuilder bdb = BeanDefinitionBuilder.rootBeanDefinition(EchoBeanPostProcessor.class);
		bdb.addPropertyValue("packages", packages);
		
		registry.registerBeanDefinition(EchoBeanPostProcessor.class.getName(), bdb.getBeanDefinition());
		
	}
}
