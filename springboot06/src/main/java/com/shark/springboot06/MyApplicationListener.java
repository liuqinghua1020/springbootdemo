package com.shark.springboot06;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 定义事件监听器 
 */
//@Component
public class MyApplicationListener implements ApplicationListener<MyApplicationEvent> {
	
	public void onApplicationEvent(MyApplicationEvent event) {
		System.out.println("接收到事件：" + event.getClass());
	}

}
