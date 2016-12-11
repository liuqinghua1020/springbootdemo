package com.shark.springboot05;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @EnableConfigurationProperties 是用来启用一个特性的，这个特性就是，可以把配置文件的属性注入到bean里面去，
 *                                一般是要和@ConfigurationProperties一起使用
 * @EnableAsync 启用异步，一般是和@Async一起使用
 */
@EnableConfigurationProperties
@EnableAsync
@ComponentScan
public class App {
    public static void main(String[] args) {
    	ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
    	System.out.println(context.getBean(TomcatProperties.class));
    	context.getBean(Runnable.class).run();
    	System.out.println("------------end------------");
    	context.close();
    }
}
