package com.rahul.abstractfactory.cpudemo;

public class Schema2 implements AbstractFactory{

	@Override
	public CPUApi createCPU() {
		return new IntelCPU(939);
	}

	@Override
	public MainBorad createMainBorad() {
		return new MSIMainBorad(939);
	}

}
