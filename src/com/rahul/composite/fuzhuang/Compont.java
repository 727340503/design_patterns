package com.rahul.composite.fuzhuang;

public abstract class Compont {
	
	public abstract void printStruct(String struct);

	public void addChild(Compont child) {
		throw new UnsupportedOperationException("对象不支持这个功能");
	}
	
	public void removeChild(Compont child) {
		throw new UnsupportedOperationException("对象不支持这个功能");
	}
	
	public Compont getChild(int index) {
		throw new UnsupportedOperationException("对象不支持这个功能");
	}
}
