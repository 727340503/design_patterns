package com.rahul.command.cookingqueueserialiszble;

import java.io.Serializable;

public class DuckCommand implements Command,Serializable {

	/**
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	*/
	
	private static final long serialVersionUID = 1L;

	private CookApi cookApi;
	
	private int tableNum;
	
	public DuckCommand(int tableNum) {
		this.tableNum = tableNum;
	}

	@Override
	public void execute() {
		cookApi.cook("北京烤鸭",tableNum);
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
