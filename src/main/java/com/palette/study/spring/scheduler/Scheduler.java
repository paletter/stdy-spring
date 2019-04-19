package com.palette.study.spring.scheduler;

import org.springframework.stereotype.Component;

@Component
public class Scheduler {

	public void stat() {
		System.out.println(System.currentTimeMillis());
	}
}
