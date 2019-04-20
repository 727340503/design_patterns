package com.rahul.builder.baoxianhetong3;
/**
 * 存在的问题：同包下还是能通过new对象来创建保险合同，不安全，需要将build放到保险合同类中并将保险合同构造器私有化，详见demo3
* @ClassName: Client
* @Description: TODO(这里用一句话描述这个类的作用)
* @author rahul
* @date 2018年8月3日
*
 */
public class Client {
	public static void main(String[] args) {
		InsuranceContract ins = new InsuranceContract.ConcreteBuilder("1", 1234L)
//										.setPersonName("zhangsan")
										.setOtherData("123")
										.setCompanyName("123").build();
		ins.test();
	}
}
