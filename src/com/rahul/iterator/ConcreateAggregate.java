package com.rahul.iterator;

public class ConcreateAggregate implements Aggregate{

	private String[] ss;
	
	public ConcreateAggregate(String[] ss) {
		this.ss = ss;
	}
	
	public Iterator createIterator() {
		return new ConcreateIterator(this);
	}
	
	@Override
	public Object get(int index) {
		if(index < ss.length && index > -1) {
			return ss[index];
		}
		return null;
	}

	@Override
	public int getSize() {
		return ss.length;
	}

}
