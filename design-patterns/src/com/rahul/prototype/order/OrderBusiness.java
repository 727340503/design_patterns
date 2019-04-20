package com.rahul.prototype.order;

public class OrderBusiness {
	
	public void saveOrder(OrderApi order) {
		while(order.getProductNum() > 1000) {
			OrderApi newOrder = order.cloneOrder();
			
			newOrder.setProductNum(1000);
			
			System.out.println("New order num:"+newOrder.getProductNum());
			
			order.setProductNum(order.getProductNum()-1000);
			
		}
		System.out.println("Old order num:"+order.getProductNum());
	}
	
}
