package com.rahul.strategy.logtemplate;

public class DBLog extends LogStrategyTemplate{

	@Override
	public void doLog(String msg) {
//		if(null != msg) {
//			int a = 5/0;
//		}
		System.out.println("¼ÇÂ¼"+msg+" logµ½DB");
	}
}
