package com.rahul.proxy;

/**
 * �������
* @ClassName: Proxy
* @Description: TODO(������һ�仰��������������)
* @author rahul
* @date 2018��8��9��
*
 */
public class Proxy implements Subject{

	/**
	 * ���б�����ľ����Ŀ�����
	 */
	private RealSubject realSubject = null;
	/**
	 * �񽨷�����ͨ��������������Ҫ������Ķ�����и�ֵ
	* ����һ���µ�ʵ�� Proxy.
	*
	* @param realSubject
	 */
	public Proxy(RealSubject realSubject) {
		this.realSubject = realSubject;
	}
	
	@Override
	public void request() {
		//ת������Ŀ�����֮ǰ������ִ��һЩ���ܴ���
		
		
		//ת�������Ŀ�����ķ���
		realSubject.request();
		
		
		//��ת������Ŀ�����֮�󣬿���ִ��һЩ���ܴ���
		
	}
	
}
