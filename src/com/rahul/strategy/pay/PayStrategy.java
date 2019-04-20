package com.rahul.strategy.pay;

public interface PayStrategy {

	/**
	 * 算法需要的数据
	 * @author rahul.rui
	 * @date 2019年4月20日
	 * @param ctx
	 * @return void
	 *
	 */
	public void pay(PayContext ctx);
	
}
