package com.rahul.strategy.price;

public class NormalCustomerStrategy implements PriceStrategy{

	@Override
	public double calcPrice(double goodsPrice) {
		System.out.println("���û�û���ۿ�");
		return goodsPrice;
	}

}
