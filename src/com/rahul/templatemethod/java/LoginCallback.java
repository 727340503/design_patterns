package com.rahul.templatemethod.java;

public interface LoginCallback {
	LoginModel findLoginUser(String name);
	
	String encryptPwd(String pwd,LoginTemplate template);
	
	boolean match(LoginModel lm, LoginModel dbLm,LoginTemplate template);
}
