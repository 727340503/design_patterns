package com.rahul.prototype.management;

public interface Prototype {
	void setName(String name);
	String getName();
	Prototype clonePrototype();
}
