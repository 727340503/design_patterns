package com.rahul.command.print;

public class Invoker {
	private Command comm;
	
	public Invoker(Command comm) {
		this.comm = comm;
	}
	
	public void startPrint() {
		comm.execute();
	}
}
