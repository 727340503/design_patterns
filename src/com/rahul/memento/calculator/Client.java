package com.rahul.memento.calculator;

public class Client {
	public static void main(String[] args) {
		OperationApi api = new Operation();
		Command addComm = new AddCommand(3);
		addComm.setOperation(api);
		Command subComm = new SubstractCommand(5);
		subComm.setOperation(api);
		
		Calculator c = new Calculator();
		c.setAddComm(addComm);
		c.setSubComm(subComm);
		
		c.addPressed();
		System.out.println("Add command execute result:"+api.getResult());
		c.undoPressed();
		System.out.println("Add undo command execute result:"+api.getResult());
		c.redoPressd();
		System.out.println("Add redo command execute result:"+api.getResult());
	}
}
