package com.rahul.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂
 * @author RahulRui
 *
 */
public class FlyweightFactory {
	
	/**
	 * 缓存多个FlyWeight对象
	 */
	private Map<String, FlyWeight> map = new HashMap<>();
	
	/**
	 * 获取key对应的享元对象
	 * @param key
	 * @return
	 */
	public FlyWeight getFlyweifht(String key) {
		//先从缓存中查找
		FlyWeight f = map.get(key);
		//如果存在，返回相对应值
		if(null == f) {
			//如果不存在，新建对象
			f = new ConcreteFlyweight(key);
			
			//将新建对象放入到map中
			map.put(key, f);
		}
		
		return f;
	}
	
}
