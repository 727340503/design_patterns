package com.rahul.examplel.watcher;

public class WatcherQuality extends WatcherQualitySubject{

	/**
	 * 水质级别：0，1，2
	 */
	private int polluteLevel;
	
	public void setPolluteLevel(int polluteLevel) {
		this.polluteLevel = polluteLevel;
		this.notifyWatchers();
	}

	@Override
	public void notifyWatchers() {
		for(WatcherObserver watcher : obs) {
			if(this.polluteLevel >= 0) {
				if("检测人员".equals(watcher.getJob())) {
					watcher.update(this);
				}
			}
			if(this.polluteLevel >= 1){
				if("预警人员".equals(watcher.getJob())) {
					watcher.update(this);
				}
			}
			if(this.polluteLevel >= 2){
				if("监测部门领导".equals(watcher.getJob())) {
					watcher.update(this);
				}
			}
			
		}
	}

	@Override
	public int getPolluteLevel() {
		return this.polluteLevel;
	}

}
