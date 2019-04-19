package com.palette.study.spring.scheduler;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ApplicationContext app = new ClassPathXmlApplicationContext("com/palette/study/spring/scheduler/spring.xml");
		
		while(true) {}
	}
}
