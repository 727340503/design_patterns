package com.rahul.flyweight;

/**
 * ��Ԫ����
 * @author RahulRui
 *
 */
public class ConcreteFlyweight implements FlyWeight{
	
	private String intrinsicState;

	public ConcreteFlyweight(String intrinsicState){
		this.intrinsicState = intrinsicState;
	}
	
	@Override
	public void operation(String extrinsieState) {
		//���幦�ܴ������ܻ��õ���Ԫ�ڲ�,�ⲿ��״̬(����)
	}

}
