package com.rahul.factorymethod;

/**
 * 创建器，生命工厂方法
* @ClassName: Creator
* @Description: TODO(这里用一句话描述这个类的作用)
* @author rahul
* @date 2018年7月27日
*
 */
public abstract class Creator {
	
	/**
	 * 该方法一般不对外，只提供给该类中的其他方法使用
	 * @author rahul.rui
	 * @date 2018年7月27日
	 * @return
	 * @return Product
	 *
	 */
	protected abstract Product factoryMethod();

	/**
	 * 示意方法,实现具体功能的方法，提供给外部使用的方法
	 * @author rahul.rui
	 * @date 2018年7月27日
	 * @return void
	 *
	 */
	public void someOperator() {
		Product product = factoryMethod();
	}
	
}