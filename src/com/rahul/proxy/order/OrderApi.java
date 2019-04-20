package com.rahul.proxy.order;

public interface OrderApi {
	
	public String getProductname();
	
	public void setProductName(String productName,String user);

	public int getOrderNum();
	
	public void setOrderNum(int orderNum,String uer);
	
	public String getOrderUser();
	
	public void setOrderUser(String orderUser,String user);
}
