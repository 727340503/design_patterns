package com.rahul.strategy.pay;

public class RMBCashPay implements PayStrategy{

	@Override
	public void pay(PayContext ctx) {
		System.out.println("���ڸ�" + ctx.getUserName() + "������ֽ�֧��"+ctx.getMoney());
	}

}
