package com.rahul.flyweight.permission;

public class Client {
	
	public static void main(String[] args) {
		
		SecurityMgr.getInstance().login("����1");
		
		System.out.println("����1�Ƿ��ܷ���" + "��Ա�б�:" + SecurityMgr.getInstance().hasPermit("����1", "��Ա�б�", "�鿴"));
		
	}
	
}
