package com.rahul.templatemethod.login;

public class Client {
	public static void main(String[] args) {
		LoginTemplate temp = new WorkerLogin();
		
		LoginModel ln = new LoginModel();
		ln.setName("123");
		ln.setPwd("123");
		
		System.out.println(temp.login(ln));
	}
}