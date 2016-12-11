package com.shark.springboot05;

import java.util.concurrent.TimeUnit;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class Jeep implements Runnable {
	
	@Async
	public void run() {
		try{
			for(int i=1;i<=10;i++){
				System.out.println("=============" + i);
				TimeUnit.SECONDS.sleep(1);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
