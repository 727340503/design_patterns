package com.rahul.prototype.orderjava;
/**
 * ʹ��Java�Դ��ķ�������ǳ��clone
* @ClassName: Client
* @Description: TODO(������һ�仰��������������)
* @author rahul
* @date 2018��8��6��
*
 */
public class Client {
	public static void main(String[] args) {
		PersonOrder order = new PersonOrder();
		order.setProductNum(9923);
		order.setCustomerName("test");
		order.setProductId("11111");
		
		PersonOrder order2 = (PersonOrder) order.clone();
		order2.setOrderNum(100);
		
		System.out.println("order="+order+":"+order.getProductNum());
		System.out.println("order2="+order2 + ":" + order2.getProductNum());
	}
}
