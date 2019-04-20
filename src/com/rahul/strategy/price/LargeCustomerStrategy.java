package com.rahul.strategy.price;

public class LargeCustomerStrategy implements PriceStrategy{

	@Override
	public double calcPrice(double goodsPrice) {
		System.out.println("��ͻ�ͳһ10%�ۿ�");
		return goodsPrice * (1 - 0.1);
	}

}
