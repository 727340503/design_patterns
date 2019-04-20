package com.rahul.simplefactory.properties;

/**
 * 客户端，使用Api接口
 * @author rahul
 *
 */
public class Client {

	public static void main(String[] args) {
		Api api = SimpleFactory.createApi();

		api.operation("正在使用简单工厂模式");
	}
	
}
