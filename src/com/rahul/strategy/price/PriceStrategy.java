package com.rahul.strategy.price;

/**
 * 策略模式,定义算法的接口
* @ClassName: strategy
* @Description: TODO(这里用一句话描述这个类的作用)
* @author rahul
* @date 2019年4月20日
*
 */
public interface PriceStrategy {
	
	/**
	 * 某个算法的接口，可以有传参，也可以有返回值
	 * @author rahul.rui
	 * @date 2019年4月20日
	 * @return void
	 *
	 */
	public double calcPrice(double goodsPrice);
	
}
