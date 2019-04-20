package com.rahul.mediator.demo1;

public abstract class Colleague {
	private Mediator mediator;
	
	public Colleague(Mediator mediator) {
		this.mediator = mediator;
	}
	
	Mediator getMediator() {
		return mediator;
	}
}
