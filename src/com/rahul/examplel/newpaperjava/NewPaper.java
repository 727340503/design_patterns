package com.rahul.examplel.newpaperjava;

import java.util.Observable;

public class NewPaper extends Observable {

	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
		//使用java的观察者模式时，该句不能少
		this.setChanged();
		//采用推模式通知所有观察者
		this.notifyObservers(content);
		//采用拉模式通知所有观察者
		this.notifyObservers();
	}

}
