package com.rahul.composite.fuzhuangremove;
/**
 * ����ģʽ�Ľ������
* @ClassName: Client
* @Description: TODO(������һ�仰��������������)
* @author rahul
* @date 2018��9��13��
*
 */
public class Client {
	public static void main(String[] args) {
		Compont root = new Composite("��װ");
		Compont r1 = new Composite("��װ");
		Compont r2 = new Composite("Ůװ");
		
		root.addChild(r1);
		root.addChild(r2);
		
		Compont l1 = new Leaf("����");
		Compont l2 = new Leaf("�п�");
		Compont l3 = new Leaf("ȹ��");
		Compont l4 = new Leaf("��װ");
		
		r1.addChild(l1);
		r1.addChild(l2);
		
		r2.addChild(l3);
		r2.addChild(l4);
		root.printStruct("");
		
		System.out.println("--------------------------");
		root.removeChild(r1);
		root.printStruct("");
	}
}
