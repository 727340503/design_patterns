package com.rahul.adapter.twoway;

import java.util.ArrayList;
import java.util.List;

/**
 * ˫������ӿ�
* @ClassName: TwoDirectAdapter
* @Description: TODO(������һ�仰��������������)
* @author rahul
* @date 2018��7��25��
*
 */
public class TwoDirectAdapter implements LogDBOperateApi,LogFileOperateApi{
	
	private LogDBOperateApi logDBOperateApi;
	
	private LogFileOperateApi logFileOperateApi;
	
	public TwoDirectAdapter(LogDBOperateApi logDBOperateApi,LogFileOperateApi logFileOperateApi) {
		this.logDBOperateApi = logDBOperateApi;
		this.logFileOperateApi = logFileOperateApi;
	}

	/**
	 * file��ʽʵ��DB�洢log
	 */
	@Override
	public void writeLog(List<LogModel> lms) {
		for(LogModel log : lms) {
			logDBOperateApi.createLog(log);
		}
	}

	/**
	 * DB�ķ�ʽʹ��file log��ʽ���
	 */
	@Override
	public void createLog(LogModel lm) {
		List<LogModel> lms = new ArrayList<LogModel>();
		lms.add(lm);
		
		logFileOperateApi.writeLog(lms);
	}

}
