package com.rahul.strategy.cardpay;

public class RMBCashPay implements PayStrategy{

	@Override
	public void pay(PayContext ctx) {
		System.out.println("现在给" + ctx.getUserName() + "人民币现金支付"+ctx.getMoney());
	}

}
