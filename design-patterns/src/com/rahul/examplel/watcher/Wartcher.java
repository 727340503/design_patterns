package com.rahul.examplel.watcher;

public class Wartcher implements WatcherObserver{
	
	private String job;
	
	public Wartcher(String job) {
		this.job = job;
	}

	@Override
	public void update(WatcherQualitySubject watcherQuality) {
		System.out.println(job+":�յ���ˮ���쳣��֪ͨ,ˮ�ʼ���Ϊ��"+watcherQuality.getPolluteLevel());
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
