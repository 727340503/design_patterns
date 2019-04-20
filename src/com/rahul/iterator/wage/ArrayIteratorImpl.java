package com.rahul.iterator.wage;

public class ArrayIteratorImpl implements Iterator{

	private SalaryAggregate salaryManager;
	
	public ArrayIteratorImpl(SalaryAggregate salaryManager) {
		this.salaryManager = salaryManager;
	}
	
	private int index = -1;
	
	@Override
	public void first() {
		index = 0;
	}

	@Override
	public void next() {
		if(index < salaryManager.size()) {
			index ++;
		}
	}

	@Override
	public boolean isDone() {
		if(index >= salaryManager.size()) {
			return true;
		}
		return false;
	}

	@Override
	public Object currentItem() {
		if(index < salaryManager.size()) {
			return salaryManager.get(index);
		}
		return null;
	}

}
