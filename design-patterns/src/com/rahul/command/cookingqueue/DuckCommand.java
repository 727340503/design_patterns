package com.rahul.command.cookingqueue;

public class DuckCommand implements Command {

	private CookApi cookApi;
	
	private int tableNum;
	
	public DuckCommand(int tableNum) {
		this.tableNum = tableNum;
	}

	@Override
	public void execute() {
		cookApi.cook("±±¾©¿¾Ñ¼",tableNum);
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
