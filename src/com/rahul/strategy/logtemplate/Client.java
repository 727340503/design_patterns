package com.rahul.strategy.logtemplate;

public class Client {
	
	public static void main(String[] args) {
		LogContext ctx = new LogContext();
		
		for(int i=0; i<=1000; i++) {
			ctx.log("这是日志"+i);
		}
	}
	
}
