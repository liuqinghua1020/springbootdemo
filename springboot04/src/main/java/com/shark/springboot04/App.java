package com.shark.springboot04;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
    	ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
    	System.out.println(System.getProperty("file.encoding"));
    	System.out.println(context.getBeansOfType(EncodingConvert.class));
    	System.out.println(context.getBeansOfType(Runnable.class));
    	context.close();
    }
}
