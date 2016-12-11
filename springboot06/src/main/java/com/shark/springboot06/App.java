package com.shark.springboot06;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
/**
 * 1：自定义事件，一般是继承ApplicationEvent抽象类
 * 2：定义事件监听器，一般是实现ApplicationListener接口
 * 3：配置监听器，启动的时候，需要把监听器加入到spring容器中
 * 4：发布事件，使用ApplicationContext.publishEvent发布事件
 * 
 * 配置监听器
 * 1：SpringApplication.addListeners 添加监听器
 * 2：把监听器纳入到spring容器中管理
 * 3：使用context.listener.classes配置项配置（详细内容参照：DelegatingApplicationListener）
 * 4：使用@EventListener注解，在方法上面加入@EventListener注解，且该类需要纳入到spring容器中管理（详细内容参照：EventListenerMethodProcessor，EventListenerFactory，）
 */
@SpringBootApplication
public class App {
    public static void main(String[] args) {
    	SpringApplication app = new SpringApplication(App.class);
//    	app.addListeners(new MyApplicationListener());
    	ConfigurableApplicationContext context = app.run(args);
    	context.publishEvent(new MyApplicationEvent(new Object()));
    	context.stop();
//    	context.close();
    }
}
