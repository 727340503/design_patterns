package com.rahul.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * ��Ԫ����
 * @author RahulRui
 *
 */
public class FlyweightFactory {
	
	/**
	 * ������FlyWeight����
	 */
	private Map<String, FlyWeight> map = new HashMap<>();
	
	/**
	 * ��ȡkey��Ӧ����Ԫ����
	 * @param key
	 * @return
	 */
	public FlyWeight getFlyweifht(String key) {
		//�ȴӻ����в���
		FlyWeight f = map.get(key);
		//������ڣ��������Ӧֵ
		if(null == f) {
			//��������ڣ��½�����
			f = new ConcreteFlyweight(key);
			
			//���½�������뵽map��
			map.put(key, f);
		}
		
		return f;
	}
	
}
