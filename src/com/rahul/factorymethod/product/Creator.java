package com.rahul.factorymethod.product;

public abstract class Creator {

	protected abstract Product1 factoryMethod1();

	protected abstract Product2 factoryMethod2();
	
	public Product createProduct() {
		
		Product1 p1 = factoryMethod1();
		
		Product2 p2 = factoryMethod2();
		
		return new Product(p1, p2);
	}
}
