package com.rahul.mediator;

/**
 * 终结者模式
 * @author RahulRui
 *
 */
public class Client {
	public static void main(String[] args) {
		Mediator m = new ConcreteMediator();
		
		ConcreteColleagueA a = new ConcreteColleagueA(m);
		a.someOperation();
		
		ConcreteColleagueB b = new ConcreteColleagueB(m);
		b.someOperation();
	}
}
