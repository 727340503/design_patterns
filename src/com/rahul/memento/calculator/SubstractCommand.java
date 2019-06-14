package com.rahul.memento.calculator;

public class SubstractCommand extends AbstractCommand{
	
	private int num;
	
	public SubstractCommand(int num) {
		this.num = num;
	}

	@Override
	public void execute() {
		api.substract(num);
	}
	
}
