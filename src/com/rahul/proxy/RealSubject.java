package com.rahul.proxy;

public class RealSubject implements Subject{

	@Override
	public void request() {
		System.out.println("Real subject log......");
	}

}
