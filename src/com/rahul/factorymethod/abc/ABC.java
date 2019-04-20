package com.rahul.factorymethod.abc;

public class ABC {
	
	private String name;
	
	private Product p;
	
	
	public ABC(String name, Product p) {
		this.p = p;
		this.name = name;
	}
	
	public void test() {
		System.out.println(name+p);
		System.out.println("ABC test ........");
	}
	
}
