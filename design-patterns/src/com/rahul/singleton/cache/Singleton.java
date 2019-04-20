package com.rahul.singleton.cache;

import java.util.HashMap;
import java.util.Map;

/**
 * ����ʽ�ĵ���ģʽ
* @ClassName: Singleton
* @Description: TODO(������һ�仰��������������)
* @author rahul
* @date 2018��7��26��
*
 */
public class Singleton {
	
	private static String CACHE_KEY = "SINGLETON";
	
	private static Map<String, Singleton> map = new HashMap<String, Singleton>();
	
	//˽�л����췽�����ڷ����ڲ�����ʵ��
	private Singleton () {
		
	}
	
	
	public static synchronized Singleton getInstance() {
	
		Singleton uniqueInstance = map.get(CACHE_KEY);
		
		//���ʵ����ֵ����ֵ
		if(null == uniqueInstance) {
			uniqueInstance = new Singleton();
			map.put(CACHE_KEY, uniqueInstance);
		}
		
		//���ؽ��
		return uniqueInstance;
	}
	
}
