package com.rahul.factorymethod;

/**
 * ��������������������
* @ClassName: Creator
* @Description: TODO(������һ�仰��������������)
* @author rahul
* @date 2018��7��27��
*
 */
public abstract class Creator {
	
	/**
	 * �÷���һ�㲻���⣬ֻ�ṩ�������е���������ʹ��
	 * @author rahul.rui
	 * @date 2018��7��27��
	 * @return
	 * @return Product
	 *
	 */
	protected abstract Product factoryMethod();

	/**
	 * ʾ�ⷽ��,ʵ�־��幦�ܵķ������ṩ���ⲿʹ�õķ���
	 * @author rahul.rui
	 * @date 2018��7��27��
	 * @return void
	 *
	 */
	public void someOperator() {
		Product product = factoryMethod();
	}
	
}