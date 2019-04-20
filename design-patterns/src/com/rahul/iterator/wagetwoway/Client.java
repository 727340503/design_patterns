package com.rahul.iterator.wagetwoway;

public class Client {
	public static void main(String[] args) {
		PayManager p1 = new PayManager();
		p1.calcPay();
		testNext(p1.createIterator());
		testPrevious(p1.createIterator());
		
		SalaryAggregate sal = new SalaryAggregate();
		sal.calcSalary();
		testNext(sal.createIterator());
		testPrevious(sal.createIterator());
	}
	
	private static void testNext(Iterator it) {
		it.first();
		while(!it.isDone()) {
			System.out.println(it.currentItem());
			it.next();
		}
	}
	
	private static void testPrevious(Iterator it) {
		it.last();
		while(!it.isFirst()) {
			System.out.println(it.currentItem());
			it.previous();
		}
	}
}
