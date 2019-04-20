package com.rahul.prototype.order;

public class Client {
	public static void main(String[] args) {
		PersonOrder order = new PersonOrder();
		order.setProductNum(9923);
		order.setCustomerName("test");
		order.setProductId("11111");
		
		OrderBusiness ob = new OrderBusiness();
		ob.saveOrder(order);
	}
}
