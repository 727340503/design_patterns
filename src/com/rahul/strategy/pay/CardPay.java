package com.rahul.strategy.pay;

public class CardPay implements PayStrategy{

	@Override
	public void pay(PayContext ctx) {
		PayContext2 ctx2 = (PayContext2) ctx;
		System.out.println("现在给" + ctx2.getUserName() +"卡" + ctx2.getAccount() + "支付"+ctx2.getMoney());
	}

}
