package com.rahul.abstractfactory.cpudemo;

public class GAMainBorad implements MainBorad{

	private Integer cpuHoles = 0;

	public GAMainBorad(int cpuHoles) {
		this.cpuHoles = cpuHoles;
	}
	
	@Override
	public void installCPU() {
		System.out.println("Now in GA MainBorad,cpuHoles="+this.cpuHoles);
	}

	
}
