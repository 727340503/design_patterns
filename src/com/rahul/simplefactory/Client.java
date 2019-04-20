package com.rahul.simplefactory;

/**
 * 客户端，使用Api接口
 * @author rahul
 *
 */
public class Client {

	public static void main(String[] args) {
		Api api = SimpleFactory.createApi(2);

		api.operation("正在使用简单工厂模式");
	}
	
}
