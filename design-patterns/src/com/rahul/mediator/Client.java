package com.rahul.mediator;

public class Client {
	public static void main(String[] args) {
		Mediator m = new ConcreteMediator();
		
		ConcreteColleagueA a = new ConcreteColleagueA(m);
		a.someOperation();
		
		ConcreteColleagueB b = new ConcreteColleagueB(m);
		b.someOperation();
	}
}
