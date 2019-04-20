package com.rahul.adapter.twoway;

public class LogDBOperater implements LogDBOperateApi{

	@Override
	public void createLog(LogModel lm) {
		
		System.out.println("Now in log db create........lm="+lm.toString());
		
	}

}
