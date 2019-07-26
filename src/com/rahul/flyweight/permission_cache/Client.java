package com.rahul.flyweight.permission_cache;

public class Client {
	
	public static void main(String[] args) {
		System.out.println("李四是否能访问" + "人员列表:" + SecurityMgr.getInstance().hasPermit("李四", "薪资数据", "查看"));
		System.out.println("张三1是否能访问" + "人员列表:" + SecurityMgr.getInstance().hasPermit("张三1", "人员列表", "查看"));
		
	}
	
}
