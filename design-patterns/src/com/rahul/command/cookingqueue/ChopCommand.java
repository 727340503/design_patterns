package com.rahul.command.cookingqueue;

public class ChopCommand implements Command{

	private CookApi cookApi;
	
	private int tableNum;
	
	public ChopCommand(int tableNum) {
		this.tableNum = tableNum;
	}
	
	@Override
	public void execute() {
		cookApi.cook("¬Ã∂π≈≈π«Ï“",tableNum);
	}

	@Override
	public void setCookApi(CookApi api) {
		this.cookApi = api;
	}

	@Override
	public int getTableNum() {
		return tableNum;
	}

}
