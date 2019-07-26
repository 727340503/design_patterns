package com.rahul.flyweight;

/**
 * 不需要共享的Flyweight对象
 * 通常是将被共享的享元对象作为子节点，组合出来的对象
 * @author RahulRui
 *
 */
public class UnsharedConcreteFlyweight implements FlyWeight{
	
	private String allState;
	
	@Override
	public void operation(String extrinsieState) {
		
	}

}
