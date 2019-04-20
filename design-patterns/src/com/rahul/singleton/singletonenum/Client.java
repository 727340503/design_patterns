package com.rahul.singleton.singletonenum;

public class Client {
	public static void main(String[] args) {
		for(int i=0;i<100; i++) {
			Singleton.uniqueInstance.system();
		}
	}
}
