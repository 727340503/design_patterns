package com.rahul.factorymethod.product;

public class CreatorImpl extends Creator{

	protected Product1 factoryMethod1() {
		return new Product1();
	};

	protected Product2 factoryMethod2() {
		return new Product2();
	};
	
}
