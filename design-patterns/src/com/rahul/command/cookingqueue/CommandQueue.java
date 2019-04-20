package com.rahul.command.cookingqueue;

import java.util.ArrayList;
import java.util.List;

public class CommandQueue {
	private static List<Command> comms = new ArrayList<Command>();
	
	public synchronized static void addMenu(MenuCommand comm) {
		comm.getComms().stream().forEach(com -> comms.add(com));
	}
	
	
	public synchronized static Command getOneCommand() {
		Command cmd = null;
		if(comms.size() > 0) {
			cmd = comms.get(0);
			
			comms.remove(0);
		}
		
		return cmd;
	}
	
}
