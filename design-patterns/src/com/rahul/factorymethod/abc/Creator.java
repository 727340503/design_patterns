package com.rahul.factorymethod.abc;

/**
 * ��������������������
* @ClassName: Creator
* @Description: TODO(������һ�仰��������������)
* @author rahul
* @date 2018��7��27��
*
 */
public abstract class Creator {
	
	public ABC createABC(String name) {
		return new ABC(name, factoryMethod());
	}
	
	protected abstract Product factoryMethod();

	/**
	 * ʾ�ⷽ��,ʵ�־��幦�ܵķ���
	 * @author rahul.rui
	 * @date 2018��7��27��
	 * @return void
	 *
	 */
	public void someOperator() {
		Product product = factoryMethod();
		System.out.println(product);
	}
	
}