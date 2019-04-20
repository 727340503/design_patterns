package com.rahul.prototype.orderjava;
/**
 * 使用Java自带的方法进行浅度clone
* @ClassName: Client
* @Description: TODO(这里用一句话描述这个类的作用)
* @author rahul
* @date 2018年8月6日
*
 */
public class Client {
	public static void main(String[] args) {
		PersonOrder order = new PersonOrder();
		order.setProductNum(9923);
		order.setCustomerName("test");
		order.setProductId("11111");
		
		PersonOrder order2 = (PersonOrder) order.clone();
		order2.setOrderNum(100);
		
		System.out.println("order="+order+":"+order.getProductNum());
		System.out.println("order2="+order2 + ":" + order2.getProductNum());
	}
}
