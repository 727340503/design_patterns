package com.rahul.adapter.twoway;

import java.util.ArrayList;
import java.util.List;

public class Client {
	
	public static void main(String[] args) {
		LogModel log = new LogModel();
		log.setId(1L);
		log.setLog("����һ��log����������");
		
		List<LogModel> lms = new ArrayList<LogModel>();
		lms.add(log);
		
		LogDBOperateApi dbLog = new LogDBOperater();
		LogFileOperateApi fileLog = new LogFileOperater();
		
		TwoDirectAdapter fileLogAdapter = new TwoDirectAdapter(dbLog, fileLog);
		TwoDirectAdapter dbLogAdapter = new TwoDirectAdapter(dbLog, fileLog);
		
		//-----------------------------ͨ��db��api����Ϊfile����ʽ��ʵ�ʵ��õ���file��ʵ�ַ�����
		dbLogAdapter.createLog(log);
		
		//-----------------------------ͨ��file��api����Ϊdb����ʽ��ʵ�ʵ��õ���db��ʵ�ַ�����
		fileLogAdapter.writeLog(lms);
		
	}
	
}
