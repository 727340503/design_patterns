package com.rahul.prototype.order;

public class PersonOrder implements OrderApi {

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
		
		PersonOrder order = new PersonOrder();
		order.setCustomerName(this.getCustomerName());
		order.setProductId(this.getProductId());
		order.setOrderNum(this.getOrderNum());
		//注意，不可以返回this，因为指向的是同一个内存空间
		return order;
	}
}
