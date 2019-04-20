package com.rahul.templatemethod.java;

public class Client {
	public static void main(String[] args) {
		LoginModel lm = new LoginModel();
		lm.setName("123");
		lm.setPwd("123");
		
		LoginTemplate template = new LoginTemplate();
		boolean flag = template.login(lm, new LoginCallback() {
			@Override
			public boolean match(LoginModel lm, LoginModel dbLm, LoginTemplate template) {
				return template.match(lm, dbLm);
			}
			
			@Override
			public LoginModel findLoginUser(String name) {
				LoginModel dbLm = new  LoginModel();
				dbLm.setName("123");
				dbLm.setPwd("321");
				return dbLm;
			}
			
			@Override
			public String encryptPwd(String pwd, LoginTemplate template) {
				return template.encryptPwd(pwd);
			}
		});
		System.out.println(flag);
	}
}	
