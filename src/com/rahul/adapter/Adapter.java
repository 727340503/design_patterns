package com.rahul.adapter;

public class Adapter implements Target{
	
	/**
	 * ��Ҫ������Ľӿڶ���
	 */
	private Adaptee adaptee;
	
	/**
	 * ���췽����������Ҫ����Ķ���ͨ��ͨ��������������
	 * @param adaptee
	 */
	public Adapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void request() {
		//ת���Ѿ�ʵ�ֵķ�������������
		adaptee.specificRequest();
	}
	
}
