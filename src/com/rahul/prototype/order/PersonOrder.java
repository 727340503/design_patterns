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
		//ע�⣬�����Է���this����Ϊָ�����ͬһ���ڴ�ռ�
		return order;
	}
}
