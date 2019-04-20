package com.rahul.strategy.price;

public class OldCustomerStrategy implements PriceStrategy{

	@Override
	public double calcPrice(double goodsPrice) {
		System.out.println("对于老用户统一5%折扣");
		return goodsPrice * (1 - 0.05);
	}

}
