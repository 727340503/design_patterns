package com.rahul.command.print;

public class Client {
	public static void main(String[] args) {
		PrintService comm = new PrintService();
		comm.setContent("²âÊÔ´òÓ¡ÄÚÈİ");
		Invoker invoker = new Invoker(comm);
		
		invoker.startPrint();
		
	}
}
