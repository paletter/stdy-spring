package com.palette.study.spring.demo.knight.role;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


public class BraveKnight implements Knight, InitializingBean, DisposableBean {

	private Quest quest;

	public BraveKnight(Quest quest) {
		this.quest = quest;
	}

	@Override
	public void embarkOnQuest() {
		quest.embark();
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initial");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Destory");
	}
	
}
