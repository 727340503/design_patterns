package com.rahul.singleton.singletonHolder;

/**
 * ����ʽ����ģʽ
* @ClassName: Singleton
* @Description: TODO(������һ�仰��������������)
* @author rahul
* @date 2018��7��26��
*
 */
public class Singleton {
	
	private static class SingletonHolder{
		private static Singleton uniqueInstance = new Singleton();
	}
	
	//˽�л����췽�����ڷ����ڲ�����ʵ��
	private Singleton () {
		
	}
	
	
	public static synchronized Singleton getInstance() {
		//���ؽ��
		return SingletonHolder.uniqueInstance;
	}
	
}
