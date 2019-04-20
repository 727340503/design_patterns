package com.rahul.singleton.singletonHolder;

/**
 * 懒汉式单例模式
* @ClassName: Singleton
* @Description: TODO(这里用一句话描述这个类的作用)
* @author rahul
* @date 2018年7月26日
*
 */
public class Singleton {
	
	private static class SingletonHolder{
		private static Singleton uniqueInstance = new Singleton();
	}
	
	//私有化构造方法，在方法内部控制实例
	private Singleton () {
		
	}
	
	
	public static synchronized Singleton getInstance() {
		//返回结果
		return SingletonHolder.uniqueInstance;
	}
	
}
