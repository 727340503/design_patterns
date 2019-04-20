package com.rahul.templatemethod.loginenhancement;

public class NomalLogin2 extends LoginTemplate{

	@Override
	public UserModel findLoginUser(String name) {
		UserModel user = new UserModel();
		user.setName("123");
		user.setPwd(encryptPwd("123"));
		user.setUserId("1");
		user.setQuestion("123");
		
		return user;
	}
	
	@Override
	public boolean match(LoginModel ln, UserModel user) {
		
		System.out.println(this.encryptPwd(ln.getPwd()));
		System.out.println(user.getPwd());
		if(user.getPwd().equals(this.encryptPwd(ln.getPwd()))) {
			if(user.getQuestion().equals(((NomalLoginModel)ln).getQuestion())) {
				return true;
			}
		
		}
		return false;
		
	}

}