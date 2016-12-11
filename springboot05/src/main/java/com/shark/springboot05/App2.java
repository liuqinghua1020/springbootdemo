package com.shark.springboot05;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Import用来导入一个或多个类（会被spring容器托管），或者配置类(配置类里面的bean都会被spring容器托管)
 */
@ComponentScan
//@Import({User.class, Role.class, MyConfiguration.class})
@EnableLog(name = "my springboot")
@EnableEcho(packages = {"com.edu.spring.springboot.bean", "com.edu.spring.springboot.vo"})
public class App2 {
    public static void main(String[] args) {
    	ConfigurableApplicationContext context = SpringApplication.run(App2.class, args);
    	System.out.println(context.getBean(User.class));
    	System.out.println(context.getBean(Role.class));
    	System.out.println(context.getBeansOfType(Runnable.class));
    	context.close();
    }
}
