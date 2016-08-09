package com.palette.study.spring.demo.knight;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.palette.study.spring.demo.knight.role.Knight;

public class KnightMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/palette/study/spring/demo/knight/knights.xml");
		Knight knight1 = (Knight) context.getBean("knight");
		knight1.embarkOnQuest();
		
		Knight knight2 = (Knight) context.getBean("knight");
		knight2.embarkOnQuest();
	}
}
