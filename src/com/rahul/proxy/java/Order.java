package com.rahul.proxy.java;

public class Order implements OrderApi {

	private String productName;
	private int orderNum;
	private String orderUser;
	
	public Order (String productName,int orderNum,String orderUser) {
		this.productName = productName;
		this.orderNum = orderNum;
		this.orderUser = orderUser;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}

	public String getOrderUser() {
		return orderUser;
	}

	public void setOrderUser(String orderUser) {
		this.orderUser = orderUser;
	}

	@Override
	public void setProductName(String productName, String user) {
		this.productName = productName;
	}

	@Override
	public String toString() {
		return "Order [productName=" + productName + ", orderNum=" + orderNum + ", orderUser=" + orderUser + "]";
	}
}
