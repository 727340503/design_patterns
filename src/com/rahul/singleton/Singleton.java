package com.rahul.singleton;

/**
 * 懒汉式单例模式
* @ClassName: Singleton
* @Description: TODO(这里用一句话描述这个类的作用)
* @author rahul
* @date 2018年7月26日
*
 */
public class Singleton {
	
	private static Singleton uniqueInstance = null;
	
	//私有化构造方法，在方法内部控制实例
	private Singleton () {
		
	}
	
	
	public static synchronized Singleton getInstance() {
		//如果实例有值，则赋值
		if(null == uniqueInstance) {
			uniqueInstance = new Singleton();
		}
		
		//返回结果
		return uniqueInstance;
	}
	
}
