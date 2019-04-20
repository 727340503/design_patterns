package com.rahul.proxy.order;

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

	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}

	public void setOrderUser(String orderUser) {
		this.orderUser = orderUser;
	}

	@Override
	public String getProductname() {
		return this.productName;
	}

	@Override
	public void setProductName(String productName, String user) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getOrderNum() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setOrderNum(int orderNum, String uer) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getOrderUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setOrderUser(String orderUser, String user) {
		// TODO Auto-generated method stub

	}

}
