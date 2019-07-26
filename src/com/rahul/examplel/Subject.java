package com.rahul.examplel;

import java.util.ArrayList;
import java.util.List;

/**
 * 观察者模式
 * 目标对象，他知道观察他的观察者，并提供公共的注册和剔除观察者的接口，以及通知接口
* @ClassName: Subject
* @Description: TODO(这里用一句话描述这个类的作用)
* @author rahul
* @date 2018年9月4日
*
 */
public class Subject {

	/**
	 * 用来保存注册的观察者对象
	 */
	private List<Observer> obs = new ArrayList<Observer>();
	
	/**
	 * 注册观察者对象
	 * @author rahul.rui
	 * @date 2018年9月4日
	 * @param ob
	 * @return void
	 *
	 */
	public void attach(Observer ob){
		obs.add(ob);
	}
	
	/**
	 * 剔除观察者对象
	 * @author rahul.rui
	 * @date 2018年9月4日
	 * @param ob
	 * @return void
	 *
	 */
	public void detach(Observer ob) {
		obs.remove(ob);
	}
	
	/**
	 * 通知观察者对象
	 * @author rahul.rui
	 * @date 2018年9月4日
	 * @return void
	 *
	 */
	public void notifiObserver() {
		for(Observer ob : obs){
			ob.update(this);
		}
	}
}
