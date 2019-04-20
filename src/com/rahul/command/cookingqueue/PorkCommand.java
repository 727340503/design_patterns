package com.rahul.command.cookingqueue;

public class PorkCommand implements Command{

	private CookApi cookApi;
	
	private int tableNum;
	
	public PorkCommand(int tableNum) {
		this.tableNum = tableNum;
	}
	
	@Override
	public void execute() {
		cookApi.cook("ËâÄà°×Èâ",tableNum);
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
