package com.rahul.iterator.javafilter;

import java.util.Iterator;

public class SalaryAggregate implements Aggregate{

	private PayModel[] payModels;
	
	@Override
	public Iterator<PayModel> createIterator() {
		return new ArrayIteratorImpl(this);
	}
	
	public PayModel[] getPays() {
		return payModels;
	}
	
	public int size() {
		return payModels.length;
	}
	
	public Object get(int index) {
		if(index < payModels.length) {
			return payModels[index];
		}
		return null;
	}
	
	public void calcSalary() {
		PayModel p1 = new PayModel();
		p1.setName("ÍõÎå");
		p1.setPay(2000.0);

		PayModel p2 = new PayModel();
		p2.setName("ÕÔÁù");
		p2.setPay(4000.0);
		
		PayModel p3 = new PayModel();
		p3.setName("Âé×Ó");
		p3.setPay(2000.0);
	
		payModels = new PayModel[]{p1,p2,p3};
	}
	
}
