package com.rahul.factorymethod.exportdata.param;

public class Client {
	
	public static void main(String[] args) {
//		ExportOperator ep = new ExportDBOperator();
		//��Ҫʹ�����ַ�ʽֱ�Ӵ������ַ�ʽ��ʵ������
		ExportOperator ep = new ExportOperator2();
		ep.saveData(1,"123");
		ep.saveData(2,"123");
		ep.saveData(3,"123");
	}
	
}
