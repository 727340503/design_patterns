package com.rahul.strategy.pay;

public class Client2 {
	public static void main(String[] args) {
		CardPay pay = new CardPay();
		
		PayContext2 ctx = new PayContext2("ũ�п�", "����", 100000.0, pay);
		ctx.payNow();
	}
}
