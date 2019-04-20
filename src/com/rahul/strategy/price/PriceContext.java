package com.rahul.strategy.price;
/**
 * �����Ķ���ͨ�������һ������Ĳ��Զ���
* @ClassName: Context
* @Description: TODO(������һ�仰��������������)
* @author rahul
* @date 2019��4��20��
*
 */
public class PriceContext {
	
	private PriceStrategy strategy;
	
	/**
	 * ���췽��������һ������Ĳ��Զ���
	* ����һ���µ�ʵ�� Context.
	*
	* @param strategy
	 */
	public PriceContext(PriceStrategy strategy) {
		this.strategy = strategy;
	}
	
	public double quote(double goodsPrice) {
		//ͨ����ת������Ĳ��Զ��������㷨����
		return strategy.calcPrice(goodsPrice);
	}

}
