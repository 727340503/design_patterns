package com.rahul.strategy.pay;

public class DollarCashPay implements PayStrategy{

	@Override
	public void pay(PayContext ctx) {
		System.out.println("现在给" + ctx.getUserName() + "美元现金支付"+ctx.getMoney());
	}

}
