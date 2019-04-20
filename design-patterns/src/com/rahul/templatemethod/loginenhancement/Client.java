package com.rahul.templatemethod.loginenhancement;

public class Client {
	public static void main(String[] args) {
		LoginTemplate temp = new NomalLogin2();
		
		NomalLoginModel ln = new NomalLoginModel();
		ln.setName("123");
		ln.setPwd("123");
		ln.setQuestion("123");
		
		System.out.println(temp.login(ln));
	}
}