package com.shark.springboot05;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Import;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
//@Import(MyImportSelector.class)
@Import(MyImportBeanDefinitionRegistrar.class)
public @interface EnableLog {
	String name();
}
