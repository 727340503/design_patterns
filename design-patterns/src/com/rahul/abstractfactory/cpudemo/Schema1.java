package com.rahul.abstractfactory.cpudemo;

public class Schema1 implements AbstractFactory{

	@Override
	public CPUApi createCPU() {
		return new AMDCPU(1156);
	}

	@Override
	public MainBorad createMainBorad() {
		return new GAMainBorad(1156);
	}

}
