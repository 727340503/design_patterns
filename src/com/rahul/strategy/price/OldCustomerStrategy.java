package com.rahul.strategy.price;

public class OldCustomerStrategy implements PriceStrategy{

	@Override
	public double calcPrice(double goodsPrice) {
		System.out.println("�������û�ͳһ5%�ۿ�");
		return goodsPrice * (1 - 0.05);
	}

}
