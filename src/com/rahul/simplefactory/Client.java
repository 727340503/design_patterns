package com.rahul.simplefactory;

/**
 * �ͻ��ˣ�ʹ��Api�ӿ�
 * @author rahul
 *
 */
public class Client {

	public static void main(String[] args) {
		Api api = SimpleFactory.createApi(2);

		api.operation("����ʹ�ü򵥹���ģʽ");
	}
	
}
