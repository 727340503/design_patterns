package com.rahul.command;

public class ConcreateCommand implements Command{

	private Receiver receiver;
	
	public ConcreateCommand(Receiver receiver) {
		this.receiver = receiver;
	}
	
	@Override
	public void execute() {
		receiver.action();
	}

}
