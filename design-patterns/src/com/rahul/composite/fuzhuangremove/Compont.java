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
		throw new UnsupportedOperationException("对象不支持这个功能");
	}

	// ----------------------------------------------------原有的定义
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
