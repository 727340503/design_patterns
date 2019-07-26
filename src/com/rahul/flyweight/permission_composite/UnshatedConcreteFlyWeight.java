package com.rahul.flyweight.permission_composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 不需要共享的享元对象的实现，他是组合模式中的组合对象
 * @author RahulRui
 *
 */
public class UnshatedConcreteFlyWeight implements Flyweight{

	/**
	 * 记录每个组合对象所包含的子组件
	 */
	private List<Flyweight> fl = new ArrayList<Flyweight>();
	
	@Override
	public boolean match(String securityEntity, String permit) {
		for(Flyweight f : fl) {
			if(f.match(securityEntity, permit)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void add(Flyweight f) {
		fl.add(f);
	}

}
