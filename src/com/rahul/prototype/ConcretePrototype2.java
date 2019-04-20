package com.rahul.prototype;

public class ConcretePrototype2 implements Prototype{
	
	public Prototype clone(){
		return new ConcretePrototype2();
	}
}
