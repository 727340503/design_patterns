package com.rahul.examplel.watcher;

public class Wartcher implements WatcherObserver{
	
	private String job;
	
	public Wartcher(String job) {
		this.job = job;
	}

	@Override
	public void update(WatcherQualitySubject watcherQuality) {
		System.out.println(job+":收到了水质异常的通知,水质级别为："+watcherQuality.getPolluteLevel());
	}

	@Override
	public void setjob(String job) {
		this.job = job;
	}

	@Override
	public String getJob() {
		return this.job;
	}

}
