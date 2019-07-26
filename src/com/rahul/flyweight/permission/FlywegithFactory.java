package com.rahul.flyweight.permission;

import java.util.HashMap;
import java.util.Map;

public class FlywegithFactory {
	private static FlywegithFactory factory = new FlywegithFactory();
	
	private FlywegithFactory() {
		
	}
	
	/**
	 * 缓存多个FlyWeight对象
	 * @return
	 */
	public static FlywegithFactory getInstance() {
		return factory;
	}
	
	private Map<String, Flyweight> map = new HashMap<>();
	
	/**
	 * 根据key获取享元对象
	 * @param key
	 * @return
	 */
	public Flyweight getFlyweight(String key) {
		Flyweight f = map.get(key);
		
		if(null == f) {
			f = new AuthorizationFlyweight(key);
			
			map.put(key, f);
		}
		
		return f;
	}
	
}
