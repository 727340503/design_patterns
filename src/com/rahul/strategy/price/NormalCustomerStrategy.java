package com.rahul.strategy.price;

public class NormalCustomerStrategy implements PriceStrategy{

	@Override
	public double calcPrice(double goodsPrice) {
		System.out.println("新用户没有折扣");
		return goodsPrice;
	}

}
