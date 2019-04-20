package com.rahul.examplel.watcher;

import java.util.ArrayList;
import java.util.List;

/**
 * 定义水质监测的目标对象
* @ClassName: WatcherQualitySubject
* @Description: TODO(这里用一句话描述这个类的作用)
* @author rahul
* @date 2018年9月6日
*
 */
public abstract class WatcherQualitySubject {
	protected List<WatcherObserver> obs = new ArrayList<WatcherObserver>();
	
	public void attach(WatcherObserver observer) {
		obs.add(observer);
	}
	
	public void detach(WatcherObserver observer) {
		obs.remove(observer);
	}
	
	public abstract void notifyWatchers();
	
	public abstract int getPolluteLevel();
}
