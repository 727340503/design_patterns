package com.rahul.examplel.watcher;

public class Client {
	public static void main(String[] args) {
		Wartcher w1 = new Wartcher("�����Ա");
		Wartcher w2 = new Wartcher("Ԥ����Ա");
		Wartcher w3 = new Wartcher("��ⲿ���쵼");
		
		WatcherQuality wq = new WatcherQuality();
		wq.attach(w1);
		wq.attach(w2);
		wq.attach(w3);
		
		wq.setPolluteLevel(2);
	}
}
