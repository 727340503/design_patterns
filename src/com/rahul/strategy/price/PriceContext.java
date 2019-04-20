package com.rahul.strategy.price;
/**
 * 上下文对象，通常会持有一个具体的策略对象
* @ClassName: Context
* @Description: TODO(这里用一句话描述这个类的作用)
* @author rahul
* @date 2019年4月20日
*
 */
public class PriceContext {
	
	private PriceStrategy strategy;
	
	/**
	 * 构造方法，传入一个具体的策略对象
	* 创建一个新的实例 Context.
	*
	* @param strategy
	 */
	public PriceContext(PriceStrategy strategy) {
		this.strategy = strategy;
	}
	
	public double quote(double goodsPrice) {
		//通常对转掉具体的策略对象运行算法运算
		return strategy.calcPrice(goodsPrice);
	}

}
