package com.rahul.abstractfactory.cpudemo;

public class IntelCPU implements CPUApi{

	private Integer pin;
	
	public IntelCPU(Integer pin) {
		this.pin = pin;
	}
	
	@Override
	public void calculate() {
		System.out.println("Now in Intel CPU, CPU���������"+this.pin);
	}
	
}
