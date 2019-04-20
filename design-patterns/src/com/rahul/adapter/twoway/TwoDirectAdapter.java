package com.rahul.adapter.twoway;

import java.util.ArrayList;
import java.util.List;

/**
 * 双向适配接口
* @ClassName: TwoDirectAdapter
* @Description: TODO(这里用一句话描述这个类的作用)
* @author rahul
* @date 2018年7月25日
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
	 * file方式实现DB存储log
	 */
	@Override
	public void writeLog(List<LogModel> lms) {
		for(LogModel log : lms) {
			logDBOperateApi.createLog(log);
		}
	}

	/**
	 * DB的方式使用file log方式存放
	 */
	@Override
	public void createLog(LogModel lm) {
		List<LogModel> lms = new ArrayList<LogModel>();
		lms.add(lm);
		
		logFileOperateApi.writeLog(lms);
	}

}
