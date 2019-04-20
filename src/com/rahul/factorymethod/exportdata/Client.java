package com.rahul.factorymethod.exportdata;

public class Client {
	
	public static void main(String[] args) {
//		ExportOperator ep = new ExportDBOperator();
		//需要使用哪种方式直接创建哪种方式的实例即可
		ExportOperator ep = new ExportTextOperator();
		ep.saveData("123");
	}
	
}
