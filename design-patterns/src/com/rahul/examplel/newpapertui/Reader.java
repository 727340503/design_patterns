package com.rahul.examplel.newpapertui;

/**
 * �۲��ߣ�Ҳ���Ƕ��ı�ֽ���û�
* @ClassName: Reader
* @Description: TODO(������һ�仰��������������)
* @author rahul
* @date 2018��9��5��
*
 */
public class Reader implements Observer{
	
	private String name;
	
	public Reader(String name) {
		this.name = name;
	}

	/**
	 * ��ģ��ģʽ����������Ҫ��ֵ
	 */
	@Override
	public void update(String content) {
		System.out.println(name+"���ڶ���ֽ,��ֽ������"+content);
	}
	
}
