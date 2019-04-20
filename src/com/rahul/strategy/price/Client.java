package com.rahul.strategy.price;

public class Client {
	public static void main(String[] args) {
		PriceStrategy strategy = new LargeCustomerStrategy();
		PriceContext context = new PriceContext(strategy);
		double quote = context.quote(1000);
		
		System.out.println("客户报价"+quote);
		
	}
}
