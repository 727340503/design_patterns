package com.rahul.simplefactory;

/**
 * �򵥹������ģʽ
 * @author rahul
 *
 */
public class SimpleFactory {

	/**
	 * ���崴��API����ķ���
	 * @param condition
	 * @return
	 */
	public static Api createApi(int condition) {
		
		//���ݲ�ͬ��������������ͬ��ʵ����
		Api api = null;
		if(condition == 1) {
			api = new ImplA();
		}else {
			api = new ImplB();
		}
		
		return api;
	}
}
