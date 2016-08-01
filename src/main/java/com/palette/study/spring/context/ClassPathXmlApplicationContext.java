package com.palette.study.spring.context;

import java.util.HashMap;
import java.util.Map;

import com.palette.study.spring.beans.BeanFactory;

public class ClassPathXmlApplicationContext implements BeanFactory {

	private Map beans = new HashMap();
	
	@Override
	public Object getBean(String id) {
		return null;
	}
	
}
