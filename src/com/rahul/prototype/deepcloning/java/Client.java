package com.rahul.prototype.deepcloning.java;

public class Client {
	public static void main(String[] args) {
		Product p1 = new Product();
		p1.setProductId("123");
		p1.setProductName("123");
		PersonOrder po = new PersonOrder();
		po.setProduct(p1);
		po.setProductNum(1000);
		
		PersonOrder po2 = (PersonOrder) po.clone();
		po2.setProductNum(2000);
		
		System.out.println("po="+po.toString()+",p1="+po.getProduct()+",num="+po.getProductNum());
		System.out.println("po1="+po2.toString()+",p2="+po2.getProduct()+",num2="+po2.getProductNum());
		
	}
}
 