package com.rahul.abstractfactory.cpudemo;

public class ComputerEngineer {

	private CPUApi cpuApi;
	
	private MainBorad mainBorad;
	
	public void makeComputer(AbstractFactory schema){
		prepareHardwares(schema);
	}

	private void prepareHardwares(AbstractFactory schema) {
		this.cpuApi = schema.createCPU();
		this.mainBorad = schema.createMainBorad();
		
		this.cpuApi.calculate();
		this.mainBorad.installCPU();
	}
	
}
