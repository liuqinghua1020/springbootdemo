package com.shark.springboot03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 通过启动参数来控制生效的profile,可以同时激活多个profile
 * --spring.profiles.active=test,dev
 * --spring.profiles=test，激活一个profile，默认的不激活（不影响配置文件）
 * @author hadoop
 *
 */
@SpringBootApplication
public class App {
    public static void main(String[] args) {
    	
//    	ConfigurableApplicationContext context = SpringApplication.run(App.class, args);
    	
    	//编程的方式指定生效的profile
    	SpringApplication app = new SpringApplication(App.class);
//    	app.setAdditionalProfiles("test", "dev");
    	
    	ConfigurableApplicationContext context = app.run(args);
    	
    	System.out.println(context.getEnvironment().getProperty("jdbc.username"));
    	System.out.println(context.getEnvironment().getProperty("jdbc.password"));
    	System.out.println(context.getEnvironment().getProperty("springboot.name"));
    	System.out.println(context.getEnvironment().getProperty("jdbc.url"));
    	System.out.println(context.getBean(TomcatProperties.class));
    	context.close();
    }
}
