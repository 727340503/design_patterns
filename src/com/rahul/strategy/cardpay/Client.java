package com.rahul.strategy.cardpay;

public class Client {
	public static void main(String[] args) {
		PayStrategy pay = new CardPay("ÕĞĞĞ¿¨");
		PayContext ctx = new PayContext("ÕÅÈı", 100000.0, pay);
		ctx.payNow();
	}
}
