package com.rahul.memento.flow;

public class FlowAMementoCareTaker {
	
	private Memento memento;
	
	public void saveMemento(Memento memento){
		this.memento = memento;
	}
	
	public Memento retiveMemento() {
		return this.memento;
	}

}
