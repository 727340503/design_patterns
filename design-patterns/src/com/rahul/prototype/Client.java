package com.rahul.prototype;

public class Client {
	/**
	 * 持有需要使用的原型接口对象
	 */
	private Prototype prototype;
	
	public Client(Prototype prototype) {
		this.prototype = prototype;
	}
	
	public void operation() {
		/**
		 * 创建原型接口的对象
		 */
		Prototype newP = prototype.clone();
	}
}
