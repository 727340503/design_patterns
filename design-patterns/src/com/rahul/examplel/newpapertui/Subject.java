package com.rahul.examplel.newpapertui;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标对象类
* @ClassName: Subject
* @Description: TODO(这里用一句话描述这个类的作用)
* @author rahul
* @date 2018年9月5日
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
	
	public void notifi(String content) {
		for(Observer ob : obs) {
			ob.update(content);
		}
	}
}
