package com.rahul.proxy.java;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Java��̬����ֻ�ܴ���ӿ�
* @ClassName: DynamicProxy
* @Description: TODO(������һ�仰��������������)
* @author rahul
* @date 2018��8��13��
*
 */
public class DynamicProxy implements InvocationHandler{
	//ֻ�ܴ���ӿڣ����ܴ�����ͨ��
	private OrderApi order = null;
	
	/**
	 * ��ȡ�󶨺ô���;���Ŀ�������Ŀ�����Ľӿ�
	 * @author rahul.rui
	 * @date 2018��8��13��
	 * @param order
	 * @return
	 * @return OrderApi
	 *
	 */
	public OrderApi getProxyInterface(Order order) {
		this.order = order;
		
		OrderApi orderApi = (OrderApi) Proxy.newProxyInstance(
												order.getClass().getClassLoader(),//��ȡclass loader 
												order.getClass().getInterfaces(), //��ȡorder�����нӿ�
												this);//�������
		
		return orderApi;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		//����ֱ������ĳЩ����������abc����
		if(method.getName().startsWith("abc")) {
			//��ȫ��д�����߼�
		}
		
		//�жϣ������set��������Ҫ�ж�Ȩ��
		if(method.getName().startsWith("set")) {
			//������Ǵ����ˣ��Ͳ����޸�
			if(order.getOrderUser() != null && order.getOrderUser().equals(args[1])) {
				return method.invoke(order, args);//ת����ʵ�����ĳЩ�������÷����൱��ֱ�ӵ���order��set����
			}else {
				throw new RuntimeException("�Բ�������Ȩ�޸ı�������");
			}
		}else {
			//���ǵ���set�����������
			return method.invoke(order, args);
		}
	}
	
}
