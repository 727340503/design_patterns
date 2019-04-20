package com.rahul.command.calculator;

public class Operation implements OperationApi{
	
	private int result;

	@Override
	public int getResult() {
		return result;
	}

	@Override
	public void setResult(int num) {
		this.result = num;
	}

	@Override
	public void add(int num) {
		this.result += num;
	}

	@Override
	public void substract(int num) {
		this.result -= num;
	}

}
