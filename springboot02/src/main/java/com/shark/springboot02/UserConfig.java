package com.shark.springboot02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * 两种获取配置的方法
 * 配置文件默认的文件名字为application.properties，
 * 默认的位置在classpath根目录，或者classpath:/config，file:/, file:config/
 * 
 * 默认的配置文件名字可以使用--spring.config.name来指定，只需要指定文件的名字，文件扩展名可以省略
 * 默认的配置文件路径可以使用--spring.config.location来指定，配置文件需要指定全路径，包括目录和文件名字，还可以指定多个，多个用逗号隔开
 * 文件的指定方式有两种，1：classpath：2：file：
 */
@Component
public class UserConfig {
	
	@Value("${local.port}")
	private String localPort;
	
	@Value("${local.port}")
	private Integer localPort2;
	
	/**
	 * @Value默认必须要有配置项，配置项可以为空。如果没有配置项，则可以给默认值
	 */
	@Value("${tomcat.port:9090}")
	private String tomcatPort;
	
	@Autowired
	private Environment env;
	
	public void show(){
		System.out.println("local.ip=" + env.getProperty("local.ip"));
		System.out.println("local.port=" + env.getProperty("local.port", Integer.class));
		System.out.println("tomcatPort=" + tomcatPort);
		System.out.println("local.port=" + localPort);
		System.out.println("local.port2=" + localPort);
		System.out.println("name=" + env.getProperty("name"));
		System.out.println("app.name=" + env.getProperty("app.name"));
	}
}
