package com.rahul.iterator;

/**
 * die dai qi µü´úÆ÷Ä£Ê½
 * @author RahulRui
 *
 */
public class Client {
	public static void main(String[] args) {
		String[] ss = new String[] {"1","3","4","7","9","15"};
		ConcreateAggregate agg = new ConcreateAggregate(ss);
		
		Iterator i = agg.createIterator();
		while(!i.isDone()) {
			System.out.println("this obj = "+i.currentItem());
			i.next();
		}
	}
}
