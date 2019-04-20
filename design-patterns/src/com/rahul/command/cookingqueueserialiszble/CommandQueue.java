package com.rahul.command.cookingqueueserialiszble;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class CommandQueue {

	private CommandQueue() {
	}
	
	private final static String FILE_NAME = "QUEUE.txt";
	
	private static List<Command> comms;

	static{
		comms = FileOpeUtil.readFile(FILE_NAME);
		if(null == comms) {
			comms = new ArrayList<Command>();
		}
	}
	
	public synchronized static void addMenu(MenuCommand comm) {
		comm.getComms().stream().forEach(com -> comms.add(com));
	
		FileOpeUtil.writeFile(FILE_NAME, comms);
	}
	
	
	public synchronized static Command getOneCommand() {
		Command cmd = null;
		if(comms.size() > 0) {
			cmd = comms.get(0);
			
			comms.remove(0);
			
			FileOpeUtil.writeFile(FILE_NAME, comms);
		}
		
		return cmd;
	}
	
}
