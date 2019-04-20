package com.rahul.iterator;

public class ConcreateIterator implements Iterator{
	
	private Aggregate aggregate;
	
	public ConcreateIterator(Aggregate aggregate) {
		this.aggregate = aggregate;
	}

	private int index = -1;
	
	@Override
	public void first() {
		index = 0;
	}

	@Override
	public void next() {
		if(index < aggregate.getSize()) {
			index ++;
		}
	}

	@Override
	public boolean isDone() {
		if(index >= aggregate.getSize()) {
			return true;
		}
		return false;
	}

	@Override
	public Object currentItem() {
		Object obj = null;
		if(index < aggregate.getSize() && index > -1) {
			obj = aggregate.get(index);
		}
		
		return obj;
	}

}
