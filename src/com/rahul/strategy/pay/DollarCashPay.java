package com.rahul.strategy.pay;

public class DollarCashPay implements PayStrategy{

	@Override
	public void pay(PayContext ctx) {
		System.out.println("���ڸ�" + ctx.getUserName() + "��Ԫ�ֽ�֧��"+ctx.getMoney());
	}

}
