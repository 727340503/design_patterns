package com.rahul.prototype.management;
/**
 * 原型管理器，做框架的时候比较通用的技术
* @ClassName: Client
* @Description: TODO(这里用一句话描述这个类的作用)
* @author rahul
* @date 2018年8月6日
*
 */
public class Client {
	public static void main(String[] args) throws Exception {
		Prototype p1 = new ConcretePrototype1();
		PrototypeManagement.setPrototype("prototype1", p1);	
		
		Prototype p3 = PrototypeManagement.getPrototype("prototype1").clonePrototype();
		p3.setName("123");
		System.out.println("第一个实例："+p3);
		
		Prototype p2 = new ConcretePrototype2();
		PrototypeManagement.setPrototype("prototype1", p2);
		
		Prototype p4 = PrototypeManagement.getPrototype("prototype1").clonePrototype();
		p4.setName("321");
		System.out.println("第二个实例："+p4);
		
		PrototypeManagement.removePrototypr("prototype1");
		
		Prototype p5 = PrototypeManagement.getPrototype("prototype1").clonePrototype();
		p5.setName("12345");
		System.out.println("第三个实例："+p5);
	}
}
