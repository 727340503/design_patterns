package com.rahul.examplel.newpaperjava;

import java.util.Observable;

public class NewPaper extends Observable {

	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
		//ʹ��java�Ĺ۲���ģʽʱ���þ䲻����
		this.setChanged();
		//������ģʽ֪ͨ���й۲���
		this.notifyObservers(content);
		//������ģʽ֪ͨ���й۲���
		this.notifyObservers();
	}

}
