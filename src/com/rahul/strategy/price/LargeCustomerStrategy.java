package com.rahul.strategy.price;

public class LargeCustomerStrategy implements PriceStrategy{

	@Override
	public double calcPrice(double goodsPrice) {
		System.out.println("大客户统一10%折扣");
		return goodsPrice * (1 - 0.1);
	}

}
