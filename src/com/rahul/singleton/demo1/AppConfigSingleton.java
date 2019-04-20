package com.rahul.singleton.demo1;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 饿汉式单例模式实现
* @ClassName: AppConfigSingleton
* @Description: TODO(这里用一句话描述这个类的作用)
* @author rahul
* @date 2018年7月26日
*
 */
public class AppConfigSingleton {
	
	private static AppConfigSingleton appConfig = new AppConfigSingleton();
	
	public static AppConfigSingleton getInstance() {
		return appConfig;
	}

	private String param1 = null;

	private String param2 = null;

	public String getParam1() {
		return param1;
	}

	public String getParam2() {
		return param2;
	}
	
	private AppConfigSingleton() {
		readConfig();
	}

	private void readConfig() {
		Properties p = new Properties();
		InputStream in = null;
		
		try {
			in = AppConfigSingleton.class.getResourceAsStream("appconfig.properties");
			p.load(in);
			
			param1 = p.getProperty("param1");
			param2 = p.getProperty("param2");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
