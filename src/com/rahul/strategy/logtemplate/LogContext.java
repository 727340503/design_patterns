package com.rahul.strategy.logtemplate;

public class LogContext {

	public void log(String msg) {
		try {
			LogStrategy dbLog = new DBLog();
			dbLog.log(msg);
		}catch (Exception e) {
			LogStrategy fileLog = new FileLog();
			fileLog.log(msg);
		}
	}
	
}
