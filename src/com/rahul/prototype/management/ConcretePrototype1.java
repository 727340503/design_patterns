package com.rahul.prototype.management;

public class ConcretePrototype1 implements Prototype{
	
	private String name;
	
	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}
	
	@Override
	public String toString() {
		return "Now in prototypr1,name="+this.name;
	}

	@Override
	public Prototype clonePrototype() {
		ConcretePrototype1 c1 = new ConcretePrototype1();
		c1.setName(this.getName());
		
		return c1;
	}

}
