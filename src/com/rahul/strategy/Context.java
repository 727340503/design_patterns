package com.rahul.strategy;
/**
 * 上下文对象，通常会持有一个具体的策略对象
* @ClassName: Context
* @Description: TODO(这里用一句话描述这个类的作用)
* @author rahul
* @date 2019年4月20日
*
 */
public class Context {
	
	private Strategy strategy;
	
	/**
	 * 构造方法，传入一个具体的策略对象
	* 创建一个新的实例 Context.
	*
	* @param strategy
	 */
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void contextInterface() {
		//通常对转掉具体的策略对象运行算法运算
		strategy.algorithmInteface();
	}

}
