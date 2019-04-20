package com.rahul.command.calculator;

public class Calculator2 {
	private Command command;

	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void runCommand() {
		this.command.execute();
	}
	
}
