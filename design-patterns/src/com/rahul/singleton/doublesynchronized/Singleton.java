package com.rahul.singleton.doublesynchronized;

/**
 * ����ʽ����ģʽ
* @ClassName: Singleton
* @Description: TODO(������һ�仰��������������)
* @author rahul
* @date 2018��7��26��
*
 */
public class Singleton {
	
	private volatile static Singleton uniqueInstance = null;
	
	//˽�л����췽�����ڷ����ڲ�����ʵ��
	private Singleton () {
		
	}
	
	
	public static Singleton getInstance() {
		//���ʵ����ֵ����ֵ
		if(null == uniqueInstance) {
			synchronized (Singleton.class) {
				if(null == uniqueInstance) {
					uniqueInstance = new Singleton();
				}
			}
		}
		
		//���ؽ��
		return uniqueInstance;
	}
	
}
