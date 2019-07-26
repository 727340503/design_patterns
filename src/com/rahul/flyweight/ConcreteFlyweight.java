package com.rahul.flyweight;

/**
 * 享元对象
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
		//具体功能处理，可能会用到享元内部,外部的状态(数据)
	}

}
