package com.rahul.flyweight.permission_composite;

import java.util.ArrayList;
import java.util.List;

/**
 * ����Ҫ�������Ԫ�����ʵ�֣��������ģʽ�е���϶���
 * @author RahulRui
 *
 */
public class UnshatedConcreteFlyWeight implements Flyweight{

	/**
	 * ��¼ÿ����϶����������������
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
