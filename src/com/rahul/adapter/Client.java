package com.rahul.adapter;

/**
 * shi pei qi ������ģʽ
 * @author RahulRui
 *
 */
public class Client {

	public static void main(String[] args) {
		
		Adaptee adaptee = new Adaptee();
		
		Target target = new Adapter(adaptee);
	
		target.request();
	}
	
}
