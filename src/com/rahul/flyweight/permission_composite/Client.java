package com.rahul.flyweight.permission_composite;

public class Client {
	
	public static void main(String[] args) {
		
		SecurityMgr.getInstance().login("����1");
		
		System.out.println("����1�Ƿ��ܷ���" + "��Ա�б�:" + SecurityMgr.getInstance().hasPermit("����1", "��Ա�б�", "�鿴"));
		SecurityMgr.getInstance().login("����");
		
		System.out.println("�����Ƿ��ܷ���" + "��Ա�б�:" + SecurityMgr.getInstance().hasPermit("����", "н������", "�鿴"));
		
	}
	
}
