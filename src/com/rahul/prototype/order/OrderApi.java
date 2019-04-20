package com.rahul.prototype.order;

public interface OrderApi {
	
	int getProductNum();
	
	void setProductNum(int productNum);
	
	OrderApi cloneOrder();
}
