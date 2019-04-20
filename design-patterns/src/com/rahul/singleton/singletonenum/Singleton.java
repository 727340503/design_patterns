package com.rahul.singleton.singletonenum;

/**
 * 枚举单例模式
* @ClassName: Singleton
* @Description: TODO(这里用一句话描述这个类的作用)
* @author rahul
* @date 2018年7月26日
*
 */
public enum Singleton {
	
	//等同于 public static final Singleton uniqueInstance = new Singleton();
	uniqueInstance;
	
	
	public void system() {
		System.out.println("system out prient:");
	}
}
