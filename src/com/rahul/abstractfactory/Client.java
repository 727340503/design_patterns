package com.rahul.abstractfactory;

/**
 * chou xiang gong chang抽象工厂模式
 * @author RahulRui
 *
 */
public class Client {
	
	public static void main(String[] args) {
		AbstractFactory f1 = new ConcreteFactory1();
		AbstractFactory f2 = new ConcreteFactory2();
		
		AbstractProductA a1 = f1.createProductA();
		a1.test();
		
		AbstractProductA a2 = f2.createProductA();
		a2.test();
		
	}
	
}
