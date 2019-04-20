package com.rahul.simplefactory.properties;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

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
	public static Api createApi() {
		//ֱ�Ӷ�ȡ�����ļ�����ȡ��Ҫ����ʵ������
		
		//���ݲ�ͬ��������������ͬ��ʵ����
		Properties p = new Properties();
		InputStream in = null;
		try {
			in = SimpleFactory.class.getResourceAsStream("FactoryTest.properties");
			p.load(in);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		Api api = null;
		//���÷������ȥ������
		try {
			api = (Api) Class.forName(p.getProperty("ImplClass")).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return api;
	}
}
