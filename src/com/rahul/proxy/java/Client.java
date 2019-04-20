package com.rahul.proxy.java;

public class Client {
	public static void main(String[] args) {
		Order order = new Order("123", 1234, "zhangsan");
		DynamicProxy proxy = new DynamicProxy();
		proxy.getProxyInterface(order).setProductName("321", "zhangsan");
		
		System.out.println(order);
		
	}
}
