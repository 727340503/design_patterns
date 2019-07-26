package com.rahul.facade;

/**
 * 外观模式
 * @author RahulRui
 *
 */
public class Client {

	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.test();
	}
	
}
