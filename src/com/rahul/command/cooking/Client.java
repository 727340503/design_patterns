package com.rahul.command.cooking;

public class Client {
	public static void main(String[] args) {
		Waiter w = new Waiter();
		
		Command chop = new ChopCommand();
		Command duck = new DuckCommand();
		Command pork = new PorkCommand();
		
		w.orderDish(chop);
		w.orderDish(duck);
		w.orderDish(pork);
		
		w.orderOver();
	}
}
