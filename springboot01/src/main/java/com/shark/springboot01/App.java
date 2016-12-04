package com.shark.springboot01;

import java.util.List;
import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App {
    public static void main( String[] args ) {
//    	ConfigurableApplicationContext context = SpringApplication.run(App2.class, args);
    	SpringApplication app = new SpringApplication(App2.class);
//    	Set<Object> sets = new HashSet<>();
//    	sets.add(App2.class);
//    	app.setSources(sets);
    	ConfigurableApplicationContext context = app.run(args);
    	context.getBean(Runnable.class).run();
    	System.out.println(context.getBean(User.class));
    	System.out.println(context.getBean(List.class));
    }
}
