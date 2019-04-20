package com.rahul.examplel.watcher;

import java.util.ArrayList;
import java.util.List;

/**
 * ����ˮ�ʼ���Ŀ�����
* @ClassName: WatcherQualitySubject
* @Description: TODO(������һ�仰��������������)
* @author rahul
* @date 2018��9��6��
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
