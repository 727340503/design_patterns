package com.rahul.strategy.pay;

public class CardPay implements PayStrategy{

	@Override
	public void pay(PayContext ctx) {
		PayContext2 ctx2 = (PayContext2) ctx;
		System.out.println("���ڸ�" + ctx2.getUserName() +"��" + ctx2.getAccount() + "֧��"+ctx2.getMoney());
	}

}
