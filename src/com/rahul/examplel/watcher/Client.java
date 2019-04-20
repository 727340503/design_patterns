package com.rahul.examplel.watcher;

public class Client {
	public static void main(String[] args) {
		Wartcher w1 = new Wartcher("检测人员");
		Wartcher w2 = new Wartcher("预警人员");
		Wartcher w3 = new Wartcher("监测部门领导");
		
		WatcherQuality wq = new WatcherQuality();
		wq.attach(w1);
		wq.attach(w2);
		wq.attach(w3);
		
		wq.setPolluteLevel(2);
	}
}
