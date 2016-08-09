package com.palette.study.spring.test;


import com.palette.study.spring.beans.BeanFactory;
import com.palette.study.spring.context.ClassPathXmlApplicationContext;
import com.palette.study.spring.demo.knight.role.Quest;
import com.palette.study.spring.test.beans.UserService;

public class ContextTest {

	public static void main(String[] args) {
		
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("com/palette/study/spring/test/beans.xml");
		
		UserService service = (UserService) beanFactory.getBean("userService");
		service.updateUser();
	}
}
