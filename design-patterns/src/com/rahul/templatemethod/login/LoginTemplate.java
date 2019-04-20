package com.rahul.templatemethod.login;

public abstract class LoginTemplate {

	public abstract UserModel findLoginUser(String name);
	
	public boolean login(LoginModel ln) {
		UserModel user = this.findLoginUser(ln.getName());
		if(null == user) {
			System.out.println("用户不存在");
			return false;
		}

		return this.match(ln, user);
	}

	public boolean match(LoginModel ln, UserModel user) {
		System.out.println(this.encryptPwd(ln.getPwd()));
		System.out.println(user.getPwd());
		if(user.getPwd().equals(this.encryptPwd(ln.getPwd()))) {
			return true;
		}
		
		return false;
	}
	
	public String encryptPwd(String pwd) {
		return pwd;
	}
}
