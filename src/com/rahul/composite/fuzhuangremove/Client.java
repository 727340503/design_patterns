package com.rahul.composite.fuzhuangremove;
/**
 * 采用模式的解决方案
* @ClassName: Client
* @Description: TODO(这里用一句话描述这个类的作用)
* @author rahul
* @date 2018年9月13日
*
 */
public class Client {
	public static void main(String[] args) {
		Compont root = new Composite("服装");
		Compont r1 = new Composite("男装");
		Compont r2 = new Composite("女装");
		
		root.addChild(r1);
		root.addChild(r2);
		
		Compont l1 = new Leaf("衬衣");
		Compont l2 = new Leaf("夹克");
		Compont l3 = new Leaf("裙子");
		Compont l4 = new Leaf("套装");
		
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
