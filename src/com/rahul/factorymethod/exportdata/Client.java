package com.rahul.factorymethod.exportdata;

public class Client {
	
	public static void main(String[] args) {
//		ExportOperator ep = new ExportDBOperator();
		//��Ҫʹ�����ַ�ʽֱ�Ӵ������ַ�ʽ��ʵ������
		ExportOperator ep = new ExportTextOperator();
		ep.saveData("123");
	}
	
}
