package com.rahul.factorymethod.product;

public class Product {

	private Product1 p1;
	private Product2 p2;
	
	public Product(Product1 p1, Product2 p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
}
