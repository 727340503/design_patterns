package com.rahul.iterator.wagetwoway;

public class SalaryAggregate implements Aggregate{

	private PayModel[] payModels;
	
	@Override
	public Iterator createIterator() {
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
		p1.setPay(200.0);
		
		PayModel p2 = new PayModel();
		p2.setName("ÕÔÁù");
		p2.setPay(300.0);
	
		payModels = new PayModel[]{p1,p2};
	}
	
}
