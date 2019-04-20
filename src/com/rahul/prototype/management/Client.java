package com.rahul.prototype.management;
/**
 * ԭ�͹�����������ܵ�ʱ��Ƚ�ͨ�õļ���
* @ClassName: Client
* @Description: TODO(������һ�仰��������������)
* @author rahul
* @date 2018��8��6��
*
 */
public class Client {
	public static void main(String[] args) throws Exception {
		Prototype p1 = new ConcretePrototype1();
		PrototypeManagement.setPrototype("prototype1", p1);	
		
		Prototype p3 = PrototypeManagement.getPrototype("prototype1").clonePrototype();
		p3.setName("123");
		System.out.println("��һ��ʵ����"+p3);
		
		Prototype p2 = new ConcretePrototype2();
		PrototypeManagement.setPrototype("prototype1", p2);
		
		Prototype p4 = PrototypeManagement.getPrototype("prototype1").clonePrototype();
		p4.setName("321");
		System.out.println("�ڶ���ʵ����"+p4);
		
		PrototypeManagement.removePrototypr("prototype1");
		
		Prototype p5 = PrototypeManagement.getPrototype("prototype1").clonePrototype();
		p5.setName("12345");
		System.out.println("������ʵ����"+p5);
	}
}
