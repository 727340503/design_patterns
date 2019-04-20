package com.rahul.prototype;

public class ConcretePrototype1 implements Prototype{
	
	public Prototype clone(){
		return new ConcretePrototype1();
	}
}
