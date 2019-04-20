package com.rahul.command.cookingqueueserialiszble;

public class Waiter {
	private MenuCommand comm = new MenuCommand();

	public void orderDish(Command comd) {
		comm.addComms(comd);
	}
	
	public void orderOver(int tableName) {
		comm.execute();
	}
	
}
