package com.shark.springboot02;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(locations="classpath:ds.properties")
public class DataSourceProperties {

	private String url;
	
	private String driverClassName;
	
	private String username;
	
	private String password;
	
	public void show(){
		System.out.println("===========DataSourceProperties============");
		System.out.println("ds.url : " + url);
		System.out.println("ds.driverClassName : " + driverClassName);
		System.out.println("ds.username : " + username);
		System.out.println("ds.password : " + password);
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDriverClassName() {
		return driverClassName;
	}

	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
