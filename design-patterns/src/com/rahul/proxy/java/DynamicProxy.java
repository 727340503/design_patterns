package com.rahul.proxy.java;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Java动态代理，只能代理接口
* @ClassName: DynamicProxy
* @Description: TODO(这里用一句话描述这个类的作用)
* @author rahul
* @date 2018年8月13日
*
 */
public class DynamicProxy implements InvocationHandler{
	//只能代理接口，不能代理普通类
	private OrderApi order = null;
	
	/**
	 * 获取绑定好代理和具体目标对象后的目标对象的接口
	 * @author rahul.rui
	 * @date 2018年8月13日
	 * @param order
	 * @return
	 * @return OrderApi
	 *
	 */
	public OrderApi getProxyInterface(Order order) {
		this.order = order;
		
		OrderApi orderApi = (OrderApi) Proxy.newProxyInstance(
												order.getClass().getClassLoader(),//获取class loader 
												order.getClass().getInterfaces(), //获取order的所有接口
												this);//传入对象
		
		return orderApi;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		//可以直接弃用某些方法，比如abc方法
		if(method.getName().startsWith("abc")) {
			//完全重写方法逻辑
		}
		
		//判断，如果是set方法，需要判断权限
		if(method.getName().startsWith("set")) {
			//如果不是创建人，就不能修改
			if(order.getOrderUser() != null && order.getOrderUser().equals(args[1])) {
				return method.invoke(order, args);//转调真实对象的某些方法，该方法相当于直接调用order的set方法
			}else {
				throw new RuntimeException("对不起，您无权修改本订单！");
			}
		}else {
			//不是调用set方法，则继续
			return method.invoke(order, args);
		}
	}
	
}
