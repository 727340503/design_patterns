package com.rahul.facade;

public class Facade {

	/**
	 * ʾ�ⷽ��������ͻ��˵�����
	 */
	public void test() {
		//���ڲ�ʵ�ֵ�ʱ�򣬿��ܻ���õ��ڲ����ʵ�֡�
		AModuleApi aApi = new AModuleApiImpl();
		aApi.testA();
		BModuleApi bApi = new BModuleApiImpl();
		bApi.testB();
		CModuleApi cApi = new CModuleApiImpl();
		cApi.testC();
	}
	
}
