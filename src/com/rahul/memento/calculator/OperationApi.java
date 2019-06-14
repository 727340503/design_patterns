package com.rahul.memento.calculator;

public interface OperationApi {

	int getResult();
	
	void add(int num);
	
	void substract(int num);
	
	Memento createMemento();

	void setMemento(Memento m);
}
