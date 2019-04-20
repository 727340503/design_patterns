package com.rahul.factorymethod.abc;

/**
 * 创建器，生命工厂方法
* @ClassName: Creator
* @Description: TODO(这里用一句话描述这个类的作用)
* @author rahul
* @date 2018年7月27日
*
 */
public abstract class Creator {
	
	public ABC createABC(String name) {
		return new ABC(name, factoryMethod());
	}
	
	protected abstract Product factoryMethod();

	/**
	 * 示意方法,实现具体功能的方法
	 * @author rahul.rui
	 * @date 2018年7月27日
	 * @return void
	 *
	 */
	public void someOperator() {
		Product product = factoryMethod();
		System.out.println(product);
	}
	
}