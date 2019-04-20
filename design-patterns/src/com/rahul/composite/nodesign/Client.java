package com.rahul.composite.nodesign;

/**
 * ʾ����Ʒ����ģʽ�������
* @ClassName: Client
* @Description: TODO(������һ�仰��������������)
* @author rahul
* @date 2018��9��13��
*
 */
public class Client {
	public static void main(String[] args) {
		Composite root = new Composite("��װ");
		Composite r1 = new Composite("��װ");
		Composite r2 = new Composite("Ůװ");
		
		Leaf l1 = new Leaf("����");
		Leaf l2 = new Leaf("�п�");
		Leaf l3 = new Leaf("ȹ��");
		Leaf l4 = new Leaf("��װ");
		
		root.addChild(r1);
		root.addChild(r2);
		
		r1.addLeaf(l1);
		r1.addLeaf(l2);
		r2.addLeaf(l3);
		r2.addLeaf(l4);
		
		root.printStruct("");
	}
}
