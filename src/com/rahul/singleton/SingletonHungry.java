package com.rahul.singleton;

/**
 * ����ʽ����ģʽ
* @ClassName: Singleton
* @Description: TODO(������һ�仰��������������)
* @author rahul
* @date 2018��7��26��
*
 */
public class SingletonHungry {
	
	private static SingletonHungry uniqueInstance = new SingletonHungry();;
	
	//˽�л����췽�����ڷ����ڲ�����ʵ��
	private SingletonHungry () {
		
	}
	
	public static SingletonHungry getInstance() {
		return uniqueInstance;
	}
	
}
