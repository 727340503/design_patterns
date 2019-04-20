package com.rahul.examplel.watcher;

public class WatcherQuality extends WatcherQualitySubject{

	/**
	 * ˮ�ʼ���0��1��2
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
				if("�����Ա".equals(watcher.getJob())) {
					watcher.update(this);
				}
			}
			if(this.polluteLevel >= 1){
				if("Ԥ����Ա".equals(watcher.getJob())) {
					watcher.update(this);
				}
			}
			if(this.polluteLevel >= 2){
				if("��ⲿ���쵼".equals(watcher.getJob())) {
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
