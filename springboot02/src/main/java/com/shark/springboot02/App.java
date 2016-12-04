package com.shark.springboot02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App {
    public static void main( String[] args ) {
//    	ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
    	SpringApplication app = new SpringApplication(App.class);
    	ConfigurableApplicationContext context = app.run(args);
    	context.getBean(UserConfig.class).show();
    	context.getBean(JdbcConfig.class).show();
    	context.getBean(DataSourceProperties.class).show();
    	context.close();
    }
}
