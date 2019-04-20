package com.rahul.iterator.wagetwoway;

public class CollectionIteratorImpl implements Iterator{

	private PayManager payManager;
	
	public CollectionIteratorImpl(PayManager payManager) {
		this.payManager = payManager;
	}
	
	private int index = -1;
	
	@Override
	public void first() {
		index = 0;
	}

	@Override
	public void next() {
		if(index < payManager.size()) {
			index ++;
		}
	}

	@Override
	public boolean isDone() {
		if(index >= payManager.size()) {
			return true;
		}
		return false;
	}

	@Override
	public Object currentItem() {
		if(index < payManager.size()) {
			return payManager.get(index);
		}
		return null;
	}

	@Override
	public void last() {
		index = payManager.size() -1;
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
