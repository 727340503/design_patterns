package com.rahul.templatemethod.loginenhancement;

public class WorkerLogin extends LoginTemplate{

	@Override
	public UserModel findLoginUser(String name) {
		UserModel user = new UserModel();
		user.setName("123");
		user.setPwd(encryptPwd("123"));
		user.setUserId("1");
		
		return user;
	}

	@Override
	public String encryptPwd(String pwd) {
		return MD5Utils.stringToMD5(pwd);
	}
}