package com.rahul.prototype;

public class Client {
	/**
	 * ������Ҫʹ�õ�ԭ�ͽӿڶ���
	 */
	private Prototype prototype;
	
	public Client(Prototype prototype) {
		this.prototype = prototype;
	}
	
	public void operation() {
		/**
		 * ����ԭ�ͽӿڵĶ���
		 */
		Prototype newP = prototype.clone();
	}
}
