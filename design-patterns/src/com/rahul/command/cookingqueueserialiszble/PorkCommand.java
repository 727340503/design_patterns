package com.rahul.command.cookingqueueserialiszble;

import java.io.Serializable;

public class PorkCommand implements Command,Serializable{

	/**
	* @Fields serialVersionUID : TODO(��һ�仰�������������ʾʲô)
	*/
	
	private static final long serialVersionUID = 1L;

	private CookApi cookApi;
	
	private int tableNum;
	
	public PorkCommand(int tableNum) {
		this.tableNum = tableNum;
	}
	
	@Override
	public void execute() {
		cookApi.cook("�������",tableNum);
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
