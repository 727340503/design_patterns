package com.rahul.command.calculator;

public class Client {
	public static void main(String[] args) {
		OperationApi api = new Operation();
		api.setResult(100);
		Command addComm = new AddCommand(api, 3);
		Command subComm = new SubstractCommand(api, 5);
		
		Calculator1 c = new Calculator1();
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
