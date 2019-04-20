package com.rahul.adapter.twoway;

import java.util.List;

public class LogFileOperater implements LogFileOperateApi{

	@Override
	public void writeLog(List<LogModel> lms) {
		System.out.println("Now in log file write......lms="+lms.toString());
	}

}
