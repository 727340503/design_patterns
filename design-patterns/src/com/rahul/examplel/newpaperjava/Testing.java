package com.rahul.examplel.newpaperjava;

public class Testing {
	public static void main(String[] args) {
		Reader r1 = new Reader("zhangsan");
		Reader r2 = new Reader("lisi");
		Reader r3 = new Reader("wangwu");
		Reader r4 = new Reader("zhaoliu");
	
		NewPaper p = new NewPaper();
		p.addObserver(r1);
		p.addObserver(r2);
		p.addObserver(r3);
		p.addObserver(r4);
		
		p.setContent("«øºÈ¡ı");
	}
}
