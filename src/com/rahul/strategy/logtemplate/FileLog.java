package com.rahul.strategy.logtemplate;

public class FileLog extends LogStrategyTemplate{

	@Override
	public void doLog(String msg) {
		System.out.println("��¼"+msg+" log���ļ�");
	}

}
