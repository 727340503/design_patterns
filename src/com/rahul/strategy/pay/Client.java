package com.rahul.strategy.pay;

public class Client {
	public static void main(String[] args) {
		RMBCashPay pay = new RMBCashPay();
		PayContext ctx = new PayContext("уехЩ", 100000.0, pay);
		ctx.payNow();
	}
}
