package com.rahul.singleton;

/**
 * 懒汉式单例模式
* @ClassName: Singleton
* @Description: TODO(这里用一句话描述这个类的作用)
* @author rahul
* @date 2018年7月26日
*
 */
public class SingletonHungry {
	
	private static SingletonHungry uniqueInstance = new SingletonHungry();;
	
	//私有化构造方法，在方法内部控制实例
	private SingletonHungry () {
		
	}
	
	public static SingletonHungry getInstance() {
		return uniqueInstance;
	}
	
}
