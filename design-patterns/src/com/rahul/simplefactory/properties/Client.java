package com.rahul.simplefactory.properties;

/**
 * �ͻ��ˣ�ʹ��Api�ӿ�
 * @author rahul
 *
 */
public class Client {

	public static void main(String[] args) {
		Api api = SimpleFactory.createApi();

		api.operation("����ʹ�ü򵥹���ģʽ");
	}
	
}
