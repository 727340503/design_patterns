package com.rahul.singleton.demo1;

import java.util.Date;

public class Client {

	public static void main(String[] args) {
		
		long startTime = new Date().getTime();
		for(int i=0; i<= 10000000; i++) {
					
//			AppConfig a = new AppConfig();
			AppConfigSingleton a = AppConfigSingleton.getInstance();
			
			System.out.println(a.getParam1());
			System.out.println(a.getParam2());
		}

		System.out.println("×ÜºÄÊ±-----" + (new Date().getTime() - startTime)/1000 + "S");
	}
	
}
