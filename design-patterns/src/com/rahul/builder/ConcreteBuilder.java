package com.rahul.builder;

public class ConcreteBuilder implements Builder{
	
	/**
	 * ���������չ����Ĳ�Ʒ����
	 */
	private Product resultProduct;
	
	/**
	 * ��ȡ���������չ����Ĳ�Ʒ����
	 * @author rahul.rui
	 * @date 2018��7��31��
	 * @return Product
	 *
	 */
	public Product getResult() {
		return resultProduct;
	}

	@Override
	public void buildPart() {
		//����ĳ�������Ĺ��ܴ���
		
	}

}
