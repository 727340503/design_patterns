package com.rahul.strategy.pay;

public class PayContext {

	private String UserName;

	private double money;

	private PayStrategy strategy;

	public PayContext(String userName, double money, PayStrategy strategy) {
		this.UserName = userName;
		this.money = money;
		this.strategy = strategy;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public void payNow() {
		strategy.pay(this);
	}

}
