package com.rahul.simplefactory;

/**
 * 简单工厂设计模式
 * @author rahul
 *
 */
public class SimpleFactory {

	/**
	 * 具体创建API对象的方法
	 * @param condition
	 * @return
	 */
	public static Api createApi(int condition) {
		
		//根据不同的条件，创建不同的实现类
		Api api = null;
		if(condition == 1) {
			api = new ImplA();
		}else {
			api = new ImplB();
		}
		
		return api;
	}
}
