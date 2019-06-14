package com.rahul.memento.calculator;

public class AddCommand extends AbstractCommand{
	
	private int num;
	
	public AddCommand(int num) {
		this.num = num;
	}
	
	@Override
	public void execute() {
		api.add(num);
	}
}
