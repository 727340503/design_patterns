package com.rahul.facade;

public class Facade {

	/**
	 * 示意方法，满足客户端的需求
	 */
	public void test() {
		//在内部实现的时候，可能会调用到内部多个实现。
		AModuleApi aApi = new AModuleApiImpl();
		aApi.testA();
		BModuleApi bApi = new BModuleApiImpl();
		bApi.testB();
		CModuleApi cApi = new CModuleApiImpl();
		cApi.testC();
	}
	
}
