package com.rahul.memento.calculator;

public class SubstractCommand implements Command{
	
	private OperationApi api;
	
	private int num;
	
	public SubstractCommand(OperationApi api,int num) {
		this.api = api;
		this.num = num;
	}

	@Override
	public void execute() {
		api.substract(num);
	}

	@Override
	public void undo() {
		api.add(num);
	}
	
}
