package com.rahul.prototype.deepcloning;

public class PersonOrder implements OrderApi {

	private Product product;

	private Integer productNum;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Integer getProductNum() {
		return productNum;
	}

	public void setProductNum(Integer productNum) {
		this.productNum = productNum;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public OrderApi cloneOrder() {
		PersonOrder p = new PersonOrder();
		p.setProductNum(this.getProductNum());
		//对于对象类型的数据，深度克隆的时候需要继续调用这个对象的克隆方法。
		p.setProduct((Product) this.getProduct().clonePrototype());
		return p;
	}

}
