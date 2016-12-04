package com.shark.springboot03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 支持获取数组，集合
 * 配置方式为   name[index]=value
 * @author hadoop
 *
 */
@Component
@ConfigurationProperties("ds")
public class TomcatProperties {

	private List<String> hosts = new ArrayList<>();
	
	private String[] ports ;

	public List<String> getHosts() {
		return hosts;
	}

	public void setHosts(List<String> hosts) {
		this.hosts = hosts;
	}

	public String[] getPorts() {
		return ports;
	}

	public void setPorts(String[] ports) {
		this.ports = ports;
	}

	@Override
	public String toString() {
		return "TomcatProperties [hosts=" + hosts + ", ports = "+Arrays.asList(ports)+"]";
	}
}
