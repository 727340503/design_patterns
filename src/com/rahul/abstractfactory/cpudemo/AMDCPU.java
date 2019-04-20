package com.rahul.abstractfactory.cpudemo;

public class AMDCPU implements CPUApi{

	private Integer pin;
	
	public AMDCPU(Integer pin) {
		this.pin = pin;
	}
	
	@Override
	public void calculate() {
		System.out.println("Now in AMD CPU, CPUµÄÕë½ÅÊıÊÇ"+this.pin);
	}
	
}
