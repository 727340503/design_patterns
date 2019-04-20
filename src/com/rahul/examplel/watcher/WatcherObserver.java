package com.rahul.examplel.watcher;

public interface WatcherObserver {
	void update(WatcherQualitySubject watcherQuality);
	
	void setjob(String job);
	
	String getJob();
}
