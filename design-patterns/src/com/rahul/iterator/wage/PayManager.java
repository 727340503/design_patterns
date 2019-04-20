package com.rahul.iterator.wage;

import java.util.ArrayList;
import java.util.List;

public class PayManager implements Aggregate{

	private List<PayModel> list = null;
	
	@Override
	public Iterator createIterator() {
		return new CollectionIteratorImpl(this);
	}
	
	public List<PayModel> getPays() {
		return list;
	}
	
	public int size() {
		return list.size();
	}
	
	public Object get(int index) {
		if(index < list.size()) {
			return list.get(index);
		}
		return null;
	}
	
	public void calcPay() {
		PayModel p1 = new PayModel();
		p1.setName("张三");
		p1.setPay(200.0);
		
		PayModel p2 = new PayModel();
		p2.setName("李四");
		p2.setPay(300.0);
		
		list = new ArrayList<PayModel>();
		list.add(p1);
		list.add(p2);
	}
	
}
