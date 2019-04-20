package com.rahul.command.cooking;

public class PorkCommand implements Command{

	private CookApi api;
	
	public void setApi(CookApi api) {
		this.api = api;
	}
	
	@Override
	public void execute() {
		api.cook("ËâÄà°×Èâ");
	}

}
