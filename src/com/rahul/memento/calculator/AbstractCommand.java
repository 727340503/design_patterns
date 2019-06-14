package com.rahul.memento.calculator;

public abstract class AbstractCommand implements Command {
	
	protected OperationApi api = null;
	public void setOperation(OperationApi operation) {
		this.api = operation;
	}
	
	public void undo(Memento m) {
		this.api.setMemento(m);
	}
	
	public void redo(Memento m) {
		this.api.setMemento(m);
	}
	
	public Memento createMemento() {
		return this.api.createMemento();
	}
}
