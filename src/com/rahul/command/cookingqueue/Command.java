package com.rahul.command.cookingqueue;

public interface Command {
	void execute();
	
	public void setCookApi(CookApi api);
	
	public int getTableNum();
}
