package com.rahul.templatemethod.java;

public class LoginTemplate {

	public boolean login(LoginModel ln, LoginCallback callback) {
		LoginModel dbLm = callback.findLoginUser(ln.getName());
		
		String encryptPwd = callback.encryptPwd(ln.getPwd(), this);
		ln.setPwd(encryptPwd);

		return callback.match(ln, dbLm, this);
	}
	
	public String encryptPwd(String pwd) {
		return pwd;
	}
	
	public boolean match(LoginModel lm, LoginModel dbLm) {
		if(lm.getPwd().equals(dbLm.getPwd())) {
			return true;
		}
		
		return false;
	}
	
}
