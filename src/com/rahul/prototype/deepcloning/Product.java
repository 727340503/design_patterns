package com.rahul.prototype.deepcloning;

public class Product implements ProductPrototype {

	private String productId;

	private String productName;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Override
	public ProductPrototype clonePrototype() {
		Product p = new Product();
		p.setProductId(this.getProductId());
		p.setProductName(this.getProductName());
		return p;
	}
}
