package com.rahul.strategy.logtemplate;

public class FileLog extends LogStrategyTemplate{

	@Override
	public void doLog(String msg) {
		System.out.println("记录"+msg+" log到文件");
	}

}
