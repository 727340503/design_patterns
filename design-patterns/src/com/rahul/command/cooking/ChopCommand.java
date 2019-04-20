package com.rahul.command.cooking;

public class ChopCommand implements Command{

	private CookApi api;
	
	public void setApi(CookApi api) {
		this.api = api;
	}
	
	@Override
	public void execute() {
		api.cook("¬Ã∂π≈≈π«Ï“");
	}

}
