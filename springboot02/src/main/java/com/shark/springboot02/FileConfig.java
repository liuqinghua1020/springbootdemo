package com.shark.springboot02;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

/**
 * 加载外部的配置
 * PropertySource 可以加载一个外部的配置（当然了，可以注解多次）
 * @PropertySources 可以加载多个外部配置
 * @author hadoop
 *
 */
@Configuration
//@PropertySource("classpath:jdbc.properties")
//@PropertySource("file:/e:/tmp/jdbc.properties")
@PropertySources({@PropertySource("classpath:jdbc.properties"),@PropertySource("file:/e:/tmp/jdbc.properties")})
public class FileConfig {

}
