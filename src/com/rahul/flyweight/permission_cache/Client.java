package com.rahul.flyweight.permission_cache;

public class Client {
	
	public static void main(String[] args) {
		System.out.println("�����Ƿ��ܷ���" + "��Ա�б�:" + SecurityMgr.getInstance().hasPermit("����", "н������", "�鿴"));
		System.out.println("����1�Ƿ��ܷ���" + "��Ա�б�:" + SecurityMgr.getInstance().hasPermit("����1", "��Ա�б�", "�鿴"));
		
	}
	
}
