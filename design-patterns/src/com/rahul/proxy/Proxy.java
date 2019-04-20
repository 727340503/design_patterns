package com.rahul.proxy;

/**
 * 代理对象
* @ClassName: Proxy
* @Description: TODO(这里用一句话描述这个类的作用)
* @author rahul
* @date 2018年8月9日
*
 */
public class Proxy implements Subject{

	/**
	 * 持有被代理的具体的目标对象
	 */
	private RealSubject realSubject = null;
	/**
	 * 否建方法，通过构建方法将需要被代理的对象进行赋值
	* 创建一个新的实例 Proxy.
	*
	* @param realSubject
	 */
	public Proxy(RealSubject realSubject) {
		this.realSubject = realSubject;
	}
	
	@Override
	public void request() {
		//转调具体目标对象之前，可以执行一些功能处理
		
		
		//转调具体的目标对象的方法
		realSubject.request();
		
		
		//在转调具体目标对象之后，可以执行一些功能处理
		
	}
	
}
