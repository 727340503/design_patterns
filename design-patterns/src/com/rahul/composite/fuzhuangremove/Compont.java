package com.rahul.composite.fuzhuangremove;

import java.util.List;

public abstract class Compont {

	private Compont parent;

	public Compont getParent() {
		return parent;
	}

	public void setParent(Compont parent) {
		this.parent = parent;
	}
	
	public List<Compont> getChildren() {
		throw new UnsupportedOperationException("����֧���������");
	}

	// ----------------------------------------------------ԭ�еĶ���
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
