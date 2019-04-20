package com.rahul.templatemethod;

public abstract class AbstractClass {
	public abstract void doPrimitiveOperation1();

	public abstract void doPrimitiveOperation2();
	
	public void templateMethod() {
		doPrimitiveOperation1();
		doPrimitiveOperation2();
	}
}
