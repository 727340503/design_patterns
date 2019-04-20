package com.rahul.strategy.cardpay;

public class CardPay implements PayStrategy{

	private String account;
	
	public CardPay(String account) {
		this.account = account;
	}
	
	@Override
	public void pay(PayContext ctx) {
		System.out.println("���ڸ�" + ctx.getUserName() +"��" + this.account + "֧��"+ctx.getMoney());
	}

}
