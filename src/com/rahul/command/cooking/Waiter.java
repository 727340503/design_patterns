package com.rahul.command.cooking;

public class Waiter {
	private MenuCommand comm = new MenuCommand();

	public void orderDish(Command comd) {
		CookApi hotCook = new HotCook();
		CookApi coolCook = new CoolCook();
		
		if(comd instanceof DuckCommand) {
			((DuckCommand) comd).setApi(hotCook);
		}else if(comd instanceof ChopCommand){
			((ChopCommand) comd).setApi(hotCook);
		}else if(comd instanceof PorkCommand){
			((PorkCommand) comd).setApi(coolCook);
		}
		
		comm.addComms(comd);
	}
	
	public void orderOver() {
		comm.execute();
	}
	
}
