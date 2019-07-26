package com.rahul.flyweight.permission_cache;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FlywegithFactory {
	
	private static FlywegithFactory factory = new FlywegithFactory();
	
	private FlywegithFactory() {
		CleanCacheTrhead thread = new CleanCacheTrhead();
		thread.start();
	}
	
	/**
	 * 缓存多个FlyWeight对象
	 * @return
	 */
	public static FlywegithFactory getInstance() {
		return factory;
	}
	
	private Map<String, Flyweight> map = new HashMap<>();
	
	private Map<String, Integer> countMap = new HashMap<>();
	
	private Map<String, CacheConfigModule> cacheConfigMap = new HashMap<>();
	
	private Long durableTime = 6 * 1000L;
	
	/**
	 * 根据key获取享元对象
	 * @param key
	 * @return
	 */
	public synchronized Flyweight getFlyweight(String key) {
		Flyweight f = map.get(key);
		
		if(null == f) {
			f = new AuthorizationFlyweight(key);
			
			map.put(key, f);
			
			countMap.put(key, 1);
			
			CacheConfigModule config = new CacheConfigModule();
			config.setBeginTime(System.currentTimeMillis());
			config.setForver(false);
			config.setDurableTime(durableTime);
			
			cacheConfigMap.put(key, config);
		}else {
			Integer count = countMap.get(key);
			count++;
			countMap.put(key, count);
			
			cacheConfigMap.get(key).setBeginTime(System.currentTimeMillis());
		}
		
		return f;
	}
	
	public synchronized void removeCache(String key) {
		map.remove(key);
		countMap.remove(key);
		cacheConfigMap.remove(key);
	}
	
	private class CleanCacheTrhead extends Thread{

		@Override
		public void run() {
			while (true) {
				Set<String> tempSet = new HashSet<>();
				Set<String> keySet = cacheConfigMap.keySet();
				for(String key : keySet) {
					CacheConfigModule config = cacheConfigMap.get(key);
					
					if((config.getBeginTime() + durableTime) <= System.currentTimeMillis()) {
						tempSet.add(key);
					}
				}
				
				for(String key : tempSet) {
					FlywegithFactory.getInstance().removeCache(key);
				}
				
				System.out.println("now thread=" + map.size() + ";map=" + map.keySet());
				
				//休眠1秒
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
}
