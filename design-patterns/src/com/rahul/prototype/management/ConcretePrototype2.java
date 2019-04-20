package com.rahul.prototype.management;

public class ConcretePrototype2 implements Prototype{
	
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
		return "Now in prototypr2,name="+this.name;
	}

	@Override
	public Prototype clonePrototype() {
		ConcretePrototype2 c1 = new ConcretePrototype2();
		c1.setName(this.getName());
		
		return c1;
	}

}
