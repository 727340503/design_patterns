package com.rahul.command.calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator1 {
	
	private List<Command> undoComms = new ArrayList<Command>();
	private List<Command> redoComms = new ArrayList<Command>();
	
	private Command addComm;
	
	private Command subComm;

	public void setAddComm(Command addComm) {
		this.addComm = addComm;
		
	}

	public void setSubComm(Command subComm) {
		this.subComm = subComm;
	}
	
	public void addPressed() {
		this.addComm.execute();
		undoComms.add(addComm);
	}

	public void substractPressed() {
		this.subComm.execute();
		undoComms.add(subComm);
	}
	
	public void undoPressed() {
		for(Command comm : undoComms) {
			comm.undo();
			redoComms.add(comm);
		}
		
		undoComms.clear();
	}
	
	public void redoPressd() {
		for(Command comm : redoComms) {
			comm.execute();
			undoComms.add(comm);
		}
		
		redoComms.clear();
	}
	
}
