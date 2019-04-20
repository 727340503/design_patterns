package com.rahul.simplefactory.properties;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 简单工厂设计模式
 * @author rahul
 *
 */
public class SimpleFactory {

	/**
	 * 具体创建API对象的方法
	 * @param condition
	 * @return
	 */
	public static Api createApi() {
		//直接读取配置文件来获取需要创建实例的类
		
		//根据不同的条件，创建不同的实现类
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
		//利用反射机制去创建，
		try {
			api = (Api) Class.forName(p.getProperty("ImplClass")).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return api;
	}
}
