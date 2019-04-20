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
		System.out.println(name+"正在读报纸，报纸内容是:"+((NewPaper) o).getContent());
	}

}
