package com.rahul.strategy.price;

/**
 * ����ģʽ,�����㷨�Ľӿ�
* @ClassName: strategy
* @Description: TODO(������һ�仰��������������)
* @author rahul
* @date 2019��4��20��
*
 */
public interface PriceStrategy {
	
	/**
	 * ĳ���㷨�Ľӿڣ������д��Σ�Ҳ�����з���ֵ
	 * @author rahul.rui
	 * @date 2019��4��20��
	 * @return void
	 *
	 */
	public double calcPrice(double goodsPrice);
	
}
