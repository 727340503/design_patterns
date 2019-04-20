package com.rahul.command.cookingqueueserialiszble;

public interface Command {
	void execute();
	
	public void setCookApi(CookApi api);
	
	public int getTableNum();
}
