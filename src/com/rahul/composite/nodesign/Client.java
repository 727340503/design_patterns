package com.rahul.composite.nodesign;

/**
 * 示例商品不用模式解决方案
* @ClassName: Client
* @Description: TODO(这里用一句话描述这个类的作用)
* @author rahul
* @date 2018年9月13日
*
 */
public class Client {
	public static void main(String[] args) {
		Composite root = new Composite("服装");
		Composite r1 = new Composite("男装");
		Composite r2 = new Composite("女装");
		
		Leaf l1 = new Leaf("衬衣");
		Leaf l2 = new Leaf("夹克");
		Leaf l3 = new Leaf("裙子");
		Leaf l4 = new Leaf("套装");
		
		root.addChild(r1);
		root.addChild(r2);
		
		r1.addLeaf(l1);
		r1.addLeaf(l2);
		r2.addLeaf(l3);
		r2.addLeaf(l4);
		
		root.printStruct("");
	}
}
