package com.rahul.flyweight.permission;

public class Client {
	
	public static void main(String[] args) {
		
		SecurityMgr.getInstance().login("张三1");
		
		System.out.println("张三1是否能访问" + "人员列表:" + SecurityMgr.getInstance().hasPermit("张三1", "人员列表", "查看"));
		
	}
	
}
