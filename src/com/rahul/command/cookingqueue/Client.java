package com.rahul.command.cookingqueue;

public class Client {
	public static void main(String[] args) {
		HotCook cook1 = new HotCook("��");
		HotCook cook2 = new HotCook("��");
		HotCook cook3 = new HotCook("��");
		HotCook cook4 = new HotCook("��");
		
		Thread t1 = new Thread(cook1);
		Thread t2 = new Thread(cook2);
		Thread t3 = new Thread(cook3);
		Thread t4 = new Thread(cook4);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		
		for(int i=0;i<=100;i++) {
			Waiter w = new Waiter();
			Command chop = new ChopCommand(i);
			Command duck = new DuckCommand(i);
			Command pork = new PorkCommand(i);
			
			w.orderDish(chop);
			w.orderDish(duck);
			w.orderDish(pork);
			w.orderOver(i);
		}
		System.out.println("�µ����");
		
		
		
		
	}
}
