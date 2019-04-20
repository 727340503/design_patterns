package com.rahul.examplel.newpaperjava;

import java.util.Observable;
import java.util.Observer;

public class Reader implements Observer{

	private String name;
	
	public Reader(String name) {
		this.name = name;
	}
	
	@Override
	public void update(Observable o, Object arg) {
		System.out.println(name+"���ڶ���ֽ����ֽ������:"+((NewPaper) o).getContent());
	}

}
