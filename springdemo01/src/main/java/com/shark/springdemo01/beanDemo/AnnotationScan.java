package com.shark.springdemo01.beanDemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@ComponentScan(basePackages="com.shark.springdemo01.beanDemo",excludeFilters=@Filter(type=FilterType.ASSIGNABLE_TYPE,classes={Car.class}))
@Configuration
public class AnnotationScan {

}
