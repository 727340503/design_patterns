package com.rahul.examplel.newpaper;

import java.util.ArrayList;
import java.util.List;

/**
 * Ŀ�������
* @ClassName: Subject
* @Description: TODO(������һ�仰��������������)
* @author rahul
* @date 2018��9��5��
*
 */
public class Subject {
	
	private List<Observer> obs = new ArrayList<Observer>();
	
	public void attach(Observer ob) {
		obs.add(ob);
	}
	
	public void detach(Observer ob) {
		obs.remove(ob);
	}
	
	public void notifi() {
		for(Observer ob : obs) {
			ob.update(this);
		}
	}
}
