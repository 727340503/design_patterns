package com.rahul.examplel.newpapertui;

public class Testing {
	
	public static void main(String[] args) {
		Reader r1 = new Reader("ÕÅÈı");
		Reader r2 = new Reader("lisi");
		Reader r3 = new Reader("wangwu");
		Reader r4 = new Reader("zhaoliu");
		
		NewsPaper s = new NewsPaper();
		s.attach(r1);
		s.attach(r2);
		s.attach(r3);
		s.attach(r4);
		
		s.setContent("Ç¿¼éÁõ");
	}
	
}
