package com.rahul.composite.fuzhuangremove;

public class Leaf extends Compont{
	
	private String name;
	
	public Leaf(String name) {
		this.name = name;
	}

	@Override
	public void printStruct(String struct) {
		System.out.println(struct + "-" + name);
	}

}
