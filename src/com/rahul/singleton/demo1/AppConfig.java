package com.rahul.singleton.demo1;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AppConfig {

	private String param1 = null;

	private String param2 = null;

	public String getParam1() {
		return param1;
	}

	public String getParam2() {
		return param2;
	}
	
	public AppConfig() {
		readConfig();
	}

	private void readConfig() {
		Properties p = new Properties();
		InputStream in = null;
		
		try {
			in = AppConfig.class.getResourceAsStream("appconfig.properties");
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
