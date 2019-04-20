package com.rahul.prototype.deepcloning.java;

public class PersonOrder implements OrderApi,Cloneable {

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
	public Object clone() {
		// TODO Auto-generated method stub
		try {
			PersonOrder order = (PersonOrder) super.clone();
			//java��clone�ӿ�ֻ��ǳ�ȿ�¡�������Ҫ��ȿ�¡����Ҫ�ֶ����ö���Ŀ�¡�����ſ���
			order.setProduct((Product) order.getProduct().clone());
			return order;
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
