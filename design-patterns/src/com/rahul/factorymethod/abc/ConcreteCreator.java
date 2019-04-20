package com.rahul.factorymethod.abc;

public class ConcreteCreator extends Creator{

	@Override
	protected Product factoryMethod() {
		return new ConcreteProduct();
	}

}
