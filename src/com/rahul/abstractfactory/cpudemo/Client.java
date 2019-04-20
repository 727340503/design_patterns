package com.rahul.abstractfactory.cpudemo;

public class Client {
	public static void main(String[] args) {
		
		AbstractFactory schema = new Schema1();
		
		ComputerEngineer ce = new ComputerEngineer();
		ce.makeComputer(schema);
	}
}
	