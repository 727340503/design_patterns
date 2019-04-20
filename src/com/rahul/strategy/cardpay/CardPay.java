package com.rahul.strategy.cardpay;

public class CardPay implements PayStrategy{

	private String account;
	
	public CardPay(String account) {
		this.account = account;
	}
	
	@Override
	public void pay(PayContext ctx) {
		System.out.println("现在给" + ctx.getUserName() +"卡" + this.account + "支付"+ctx.getMoney());
	}

}
