package com.rahul.prototype.orderjava;

public class PersonOrder implements Cloneable,OrderApi {

	private String customerName;
	private String productId;
	private Integer orderNum;


	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public Integer getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}

	@Override
	public void setProductNum(int productNum) {
		this.setOrderNum(productNum);
	}

	@Override
	public int getProductNum() {
		return this.getOrderNum();
	}

	@Override
	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}
}
