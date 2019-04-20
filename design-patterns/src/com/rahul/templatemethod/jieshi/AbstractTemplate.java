package com.rahul.templatemethod.jieshi;

public abstract class AbstractTemplate {
	
	/**
	 * ģ�巽��������Ǽܵ��㷨
	 * @author rahul.rui
	 * @date 2018��9��18��
	 * @return void
	 *
	 */
	public final void templateMethod() {
		//��һ����
		this.operation1();
		//�ڶ�����
		this.operation2();
		//��������
		this.doPrimitiveOperation();
		//���Ĳ���
		this.hookOperation();
	}
	
	/**
	 * ������������಻��Ҫ����
	 * @author rahul.rui
	 * @date 2018��9��18��
	 * @return void
	 *
	 */
	private void operation1() {
		
	}
	
	/**
	 * ����������㷨�еĲ��裬�̶�ʵ�֣����������Ҫ����
	 * @author rahul.rui
	 * @date 2018��9��18��
	 * @return void
	 *
	 */
	protected final void operation2() {
		
	}
	
	/**
	 * ����ĳ����෽��������Ĺ����Ĺ��ܣ���Ҫ�ṩ������ʹ��
	 * @author rahul.rui
	 * @date 2018��9��18��
	 * @return void
	 *
	 */
	protected void commonOperation() {
		
	}
	
	
	/**
	 * ԭ�﷽�����㷨�б�Ҫ�Ĳ��裬�����޷�ȷ�����ʵ�֣���Ҫ������ʵ��
	 * @author rahul.rui
	 * @date 2018��9��18��
	 * @return void
	 *
	 */
	protected abstract void doPrimitiveOperation();

	/**
	 * ���ӷ������㷨�еĲ��裬��һ����Ҫ���ṩĬ��ʵ��
	 * �������ʹ�ø���Ĺ��ӷ������������Լ�ʵ��
	 * @author rahul.rui
	 * @date 2018��9��18��
	 * @return void
	 *
	 */
	protected void hookOperation() {
		
	}
}
