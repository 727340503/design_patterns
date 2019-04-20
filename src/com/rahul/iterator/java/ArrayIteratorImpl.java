package com.rahul.iterator.java;

import java.util.Iterator;

public class ArrayIteratorImpl implements Iterator<PayModel>{

	private SalaryAggregate salaryManager;
	
	public ArrayIteratorImpl(SalaryAggregate salaryManager) {
		this.salaryManager = salaryManager;
	}
	
	private int index = -1;
	
	@Override
	public boolean hasNext() {
		index ++;
		if(index < salaryManager.size()) {
			return true;
		}
		return false;
	}

	@Override
	public PayModel next() {
		if(index < salaryManager.size()) {
			return (PayModel) salaryManager.get(index);
		}
		return null;
	}

}
