package com.rahul.strategy.cardpay;

public interface PayStrategy {

	/**
	 * �㷨��Ҫ������
	 * @author rahul.rui
	 * @date 2019��4��20��
	 * @param ctx
	 * @return void
	 *
	 */
	public void pay(PayContext ctx);
	
}
