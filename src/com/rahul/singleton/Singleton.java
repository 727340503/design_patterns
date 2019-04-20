package com.rahul.singleton;

/**
 * ����ʽ����ģʽ
* @ClassName: Singleton
* @Description: TODO(������һ�仰��������������)
* @author rahul
* @date 2018��7��26��
*
 */
public class Singleton {
	
	private static Singleton uniqueInstance = null;
	
	//˽�л����췽�����ڷ����ڲ�����ʵ��
	private Singleton () {
		
	}
	
	
	public static synchronized Singleton getInstance() {
		//���ʵ����ֵ����ֵ
		if(null == uniqueInstance) {
			uniqueInstance = new Singleton();
		}
		
		//���ؽ��
		return uniqueInstance;
	}
	
}
