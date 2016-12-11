package com.shark.springboot06;

import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventHandle {

	/**
	 * 参数任意
	 * 所有，该参数事件，或者其子事件（子类）都可以接收到
	 */
	@EventListener
	public void event(Object event) {
		System.out.println("MyEventHandle 接收到事件：" + event.getClass());
	} 
	
	@EventListener
	public void event2(ContextStoppedEvent event){
		System.out.println("应用停止事件：" + event.getClass());
	}
}
