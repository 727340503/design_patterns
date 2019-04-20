package com.rahul.mediator;

public class ConcreteColleagueA extends Colleague{

	public ConcreteColleagueA(Mediator mediator) {
		super(mediator);
	}
	
	public void someOperation() {
		//在需要跟其他同事通信的时候，通知中介者对象
		getMediator().changed(this);
	}
	
}
