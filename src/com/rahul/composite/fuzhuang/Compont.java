package com.rahul.composite.fuzhuang;

public abstract class Compont {
	
	public abstract void printStruct(String struct);

	public void addChild(Compont child) {
		throw new UnsupportedOperationException("����֧���������");
	}
	
	public void removeChild(Compont child) {
		throw new UnsupportedOperationException("����֧���������");
	}
	
	public Compont getChild(int index) {
		throw new UnsupportedOperationException("����֧���������");
	}
}
