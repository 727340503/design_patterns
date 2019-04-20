package com.rahul.strategy.cardpay;

public class Client {
	public static void main(String[] args) {
		PayStrategy pay = new CardPay("���п�");
		PayContext ctx = new PayContext("����", 100000.0, pay);
		ctx.payNow();
	}
}
