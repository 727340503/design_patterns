package com.rahul.factorymethod.exportdata.param;

public class Client {
	
	public static void main(String[] args) {
//		ExportOperator ep = new ExportDBOperator();
		//需要使用哪种方式直接创建哪种方式的实例即可
		ExportOperator ep = new ExportOperator2();
		ep.saveData(1,"123");
		ep.saveData(2,"123");
		ep.saveData(3,"123");
	}
	
}
