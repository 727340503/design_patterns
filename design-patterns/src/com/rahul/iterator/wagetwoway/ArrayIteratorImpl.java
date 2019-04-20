package com.rahul.iterator.wagetwoway;

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

	@Override
	public void last() {
		index = salaryManager.size() -1;
	}

	@Override
	public boolean isFirst() {
		if(index < 0) {
			return true;
		}
		return false;
	}

	@Override
	public void previous() {
		if(index >= 0) {
			index --;
		}
	}

}
