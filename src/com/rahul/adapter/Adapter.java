package com.rahul.adapter;

public class Adapter implements Target{
	
	/**
	 * 需要被适配的接口对象
	 */
	private Adaptee adaptee;
	
	/**
	 * 构造方法，传入需要适配的对象，通常通过构造器来创建
	 * @param adaptee
	 */
	public Adapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void request() {
		//转调已经实现的方法，进行适配
		adaptee.specificRequest();
	}
	
}
