package com.rahul.iterator.wage;

public class PayModel {
	private String name;
	private double pay;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}
	
	@Override
	public String toString() {
		return new StringBuilder().append(name).append("的工资是").append(pay).toString();
	}

}
