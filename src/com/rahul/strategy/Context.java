package com.rahul.strategy;
/**
 * �����Ķ���ͨ�������һ������Ĳ��Զ���
* @ClassName: Context
* @Description: TODO(������һ�仰��������������)
* @author rahul
* @date 2019��4��20��
*
 */
public class Context {
	
	private Strategy strategy;
	
	/**
	 * ���췽��������һ������Ĳ��Զ���
	* ����һ���µ�ʵ�� Context.
	*
	* @param strategy
	 */
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void contextInterface() {
		//ͨ����ת������Ĳ��Զ��������㷨����
		strategy.algorithmInteface();
	}

}
