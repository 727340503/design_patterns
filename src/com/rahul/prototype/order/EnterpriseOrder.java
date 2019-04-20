package com.rahul.prototype.order;

public class EnterpriseOrder implements OrderApi {

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
	public OrderApi cloneOrder() {
		EnterpriseOrder order = new EnterpriseOrder();
		order.setCustomerName(this.getCustomerName());
		order.setOrderNum(this.getOrderNum());
		order.setProductId(this.getProductId());
		return order;
	}
	
}
