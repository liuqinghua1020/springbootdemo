package com.shark.springdemo01.beanDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationClient {

	public static void annotationMethod01(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.shark.springdemo01.beanDemo");
		System.out.println(context.getBean("&createRunnableFactoryBean"));
		System.out.println(context.getBean(RunnableFactoryBean.class));
		System.out.println(context.getBean(Car.class));
		System.out.println(context.getBean(Cat.class));
		System.out.println(context.getBean(Dog.class));
		System.out.println(context.getBean(Animal.class));
		context.close();
	}

	public static void annotationMethod02(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationScan.class);
		System.out.println(context.getBean("&createRunnableFactoryBean"));
		System.out.println(context.getBean(RunnableFactoryBean.class));
		System.out.println(context.getBean(Car.class));
		System.out.println(context.getBean(Cat.class));
		System.out.println(context.getBean(Animal.class));
		context.close();
	}

	public static void annotationMethod03(){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class, User.class);
		System.out.println(context.getBean(MyBean.class));
		System.out.println(context.getBean("myBean"));
		System.out.println(context.getBean(Jeep.class));
		System.out.println(context.getBean("createRunnableFactoryBean"));
		System.out.println(context.getBean("&createRunnableFactoryBean"));
		System.out.println(context.getBean(RunnableFactoryBean.class));
		System.out.println(context.getBean(Car.class));
		System.out.println(context.getBean(Cat.class));
		System.out.println(context.getBean(Dog.class));
		System.out.println(context.getBean(Animal.class));
		System.out.println(context.getBean("myUser"));
		System.out.println(context.getBeansOfType(User.class));
		User user = context.getBean("myUser", User.class);
		System.out.println(user);
		context.close();
	}

	public static void main(String[] args) {
		annotationMethod01();
		annotationMethod02();
	}

}
