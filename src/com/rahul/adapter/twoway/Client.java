package com.rahul.adapter.twoway;

import java.util.ArrayList;
import java.util.List;

public class Client {
	
	public static void main(String[] args) {
		LogModel log = new LogModel();
		log.setId(1L);
		log.setLog("这是一个log。。。。。");
		
		List<LogModel> lms = new ArrayList<LogModel>();
		lms.add(log);
		
		LogDBOperateApi dbLog = new LogDBOperater();
		LogFileOperateApi fileLog = new LogFileOperater();
		
		TwoDirectAdapter fileLogAdapter = new TwoDirectAdapter(dbLog, fileLog);
		TwoDirectAdapter dbLogAdapter = new TwoDirectAdapter(dbLog, fileLog);
		
		//-----------------------------通过db的api保存为file的形式，实际调用的是file的实现方法。
		dbLogAdapter.createLog(log);
		
		//-----------------------------通过file的api保存为db的形式，实际调用的是db的实现方法。
		fileLogAdapter.writeLog(lms);
		
	}
	
}
