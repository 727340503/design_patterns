package com.rahul.strategy.log;

public class FileLog implements LogStrategy{

	@Override
	public void log(String msg) {
		System.out.println("记录"+msg+" log到文件");
	}

}
