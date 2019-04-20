package com.rahul.command.calculator;

public class AddCommand implements Command{
	
	private OperationApi api;
	
	private int num;
	
	public AddCommand(OperationApi api,int num) {
		this.api = api;
		this.num = num;
	}

	@Override
	public void execute() {
		api.add(num);
	}

	@Override
	public void undo() {
		api.substract(num);
	}
	
}
