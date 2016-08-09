package com.palette.study.spring.test.beans;


public class UserServiceImpl implements UserService {

	private UserDao userDao;
	
	@Override
	public void updateUser() {
		System.out.println("UserService update user!");
		userDao.update();
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
}
