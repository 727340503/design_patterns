package com.rahul.command.cookingqueueserialiszble;

public class Client {
	public static void main(String[] args) {
		
		CookManager.runCook();
		
		for(int i=0;i<=5;i++) {
			Waiter w = new Waiter();
			Command chop = new ChopCommand(i);
			Command duck = new DuckCommand(i);
			Command pork = new PorkCommand(i);
			
			w.orderDish(chop);
			w.orderDish(duck);
			w.orderDish(pork);
			w.orderOver(i);
		}
		System.out.println("下单完成");
	}
}
