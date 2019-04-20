package com.rahul.composite.nodesign;

public class Leaf {
	
	private String name;
	
	public Leaf(String name) {
		this.name = name;
	}
	
	public void printStruct(String structStr) {
		System.out.println(structStr + "-" + this.name);
	}
}
