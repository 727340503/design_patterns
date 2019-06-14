package com.rahul.memento.calculator;

public interface Command {

	void execute();
	
	void undo();
}
