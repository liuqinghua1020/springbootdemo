package com.shark.springboot05;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="tomcat")
public class TomcatProperties {
	private String host;
	private Integer port;
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public Integer getPort() {
		return port;
	}
	public void setPort(Integer port) {
		this.port = port;
	}
	public String toString() {
		return "TomcatProperties [host=" + host + ", port=" + port + "]";
	}
}
