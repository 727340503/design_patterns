package com.rahul.templatemethod.login;

public class NomalLogin extends LoginTemplate{

	@Override
	public UserModel findLoginUser(String name) {
		UserModel user = new UserModel();
		user.setName("123");
		user.setPwd(encryptPwd("123"));
		user.setUserId("1");
		
		return user;
	}

}