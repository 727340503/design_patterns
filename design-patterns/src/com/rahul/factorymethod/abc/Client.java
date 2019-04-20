package com.rahul.factorymethod.abc;

public class Client {

	public static void main(String[] args) {
		
		ABC abc = new ConcreteCreator().createABC("123");
		abc.test();
		
	}
		
}	
