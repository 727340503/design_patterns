package com.rahul.examplel.newpaper;

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
	 * ��ģ��ģʽ��������Ŀ���������
	 */
	@Override
	public void update(Subject subject) {
		System.out.println(name+"���ڶ���ֽ,��ֽ������"+((NewsPaper) subject).getContent());
	}
	
}
