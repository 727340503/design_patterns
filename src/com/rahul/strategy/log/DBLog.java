package com.rahul.strategy.log;

public class DBLog implements LogStrategy{

	@Override
	public void log(String msg) {
//		if(null != msg) {
//			int a = 5/0;
//		}
		System.out.println("��¼"+msg+" log��DB");
	}

}
