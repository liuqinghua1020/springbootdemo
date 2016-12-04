package com.shark.springboot01;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration
public class MyConfig {

	@Bean
	public List createList(){
		return new ArrayList();
	}
}
