package com.palette.study.spring.test.beans;

public class UserDaoImpl implements UserDao {

	@Override
	public void update() {
		System.out.println("UserDao update!");
	}

}
