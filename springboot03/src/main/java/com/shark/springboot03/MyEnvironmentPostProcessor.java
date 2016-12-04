package com.shark.springboot03;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.stereotype.Component;

@Component
public class MyEnvironmentPostProcessor implements EnvironmentPostProcessor {
	public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
		try(InputStream input = new FileInputStream("d:/tmp/springboot.properties")){
			Properties source = new Properties();
			source.load(input);
			PropertiesPropertySource propertySource = new PropertiesPropertySource("my", source);
			environment.getPropertySources().addLast(propertySource);
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
