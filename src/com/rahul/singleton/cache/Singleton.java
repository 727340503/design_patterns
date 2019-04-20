package com.rahul.singleton.cache;

import java.util.HashMap;
import java.util.Map;

/**
 * 缓存式的单例模式
* @ClassName: Singleton
* @Description: TODO(这里用一句话描述这个类的作用)
* @author rahul
* @date 2018年7月26日
*
 */
public class Singleton {
	
	private static String CACHE_KEY = "SINGLETON";
	
	private static Map<String, Singleton> map = new HashMap<String, Singleton>();
	
	//私有化构造方法，在方法内部控制实例
	private Singleton () {
		
	}
	
	
	public static synchronized Singleton getInstance() {
	
		Singleton uniqueInstance = map.get(CACHE_KEY);
		
		//如果实例有值，则赋值
		if(null == uniqueInstance) {
			uniqueInstance = new Singleton();
			map.put(CACHE_KEY, uniqueInstance);
		}
		
		//返回结果
		return uniqueInstance;
	}
	
}
