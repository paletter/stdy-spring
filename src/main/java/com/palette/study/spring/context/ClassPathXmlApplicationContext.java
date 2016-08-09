package com.palette.study.spring.context;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;

import com.palette.study.spring.beans.BeanFactory;

public class ClassPathXmlApplicationContext implements BeanFactory {

	private Map<String, Object> beansMap = new HashMap<String, Object>();
	
	public ClassPathXmlApplicationContext(String xmlPath) {
		
		try {
			
			SAXBuilder sb = new SAXBuilder();
			Document doc = sb.build(this.getClass().getClassLoader().getResourceAsStream(xmlPath));
			Element root = doc.getRootElement();
			List<Element> list = root.getChildren("bean");
			
			for(Element e : list) {
				
				String id = e.getAttributeValue("id");
				String clazz = e.getAttributeValue("class");
				Object beanObj = Class.forName(clazz).newInstance();
				
				beansMap.put(id, beanObj);
				
				List<Element> propertyList = e.getChildren("property");
				for(Element e2 : propertyList) {
					String name = e2.getAttributeValue("name");
					String bean = e2.getAttributeValue("ref");
					
					Object injectObj = beansMap.get(bean);
					String methodName = "set" + name.substring(0, 1).toUpperCase() + name.substring(1);
					Method method = beanObj.getClass().getMethod(methodName, injectObj.getClass().getInterfaces());
					method.invoke(beanObj, injectObj);
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Object getBean(String id) {
		return beansMap.get(id);
	}

}
