package com.rahul.singleton.singletonenum;

/**
 * ö�ٵ���ģʽ
* @ClassName: Singleton
* @Description: TODO(������һ�仰��������������)
* @author rahul
* @date 2018��7��26��
*
 */
public enum Singleton {
	
	//��ͬ�� public static final Singleton uniqueInstance = new Singleton();
	uniqueInstance;
	
	
	public void system() {
		System.out.println("system out prient:");
	}
}
