package com.rahul.strategy.logtemplate;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class LogStrategyTemplate implements LogStrategy{
	
	public void log(String msg) {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss sss");
		msg = df.format(new Date()) + "ÄÚÈÝÊÇ" + msg;
		doLog(msg);
	}
	
	public abstract void doLog(String msg);
	
}
