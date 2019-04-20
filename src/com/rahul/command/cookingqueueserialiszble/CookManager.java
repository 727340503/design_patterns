package com.rahul.command.cookingqueueserialiszble;

public class CookManager {
	
	public static void runCook() {
		HotCook cook1 = new HotCook("’≈");
		HotCook cook2 = new HotCook("¿Ó");
		HotCook cook3 = new HotCook("¡ı");
		HotCook cook4 = new HotCook("Õı");
		
		Thread t1 = new Thread(cook1);
		Thread t2 = new Thread(cook2);
		Thread t3 = new Thread(cook3);
		Thread t4 = new Thread(cook4);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
