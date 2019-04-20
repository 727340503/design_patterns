package com.rahul.abstractfactory.cpudemo;

public class MSIMainBorad implements MainBorad{

	private Integer cpuHoles = 0;

	public MSIMainBorad(int cpuHoles) {
		this.cpuHoles = cpuHoles;
	}
	
	@Override
	public void installCPU() {
		System.out.println("Now in MSI MainBorad,cpuHoles="+this.cpuHoles);
	}

	
}
