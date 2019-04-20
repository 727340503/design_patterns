package com.rahul.iterator.wage;

public class Client {
	public static void main(String[] args) {
		PayManager p1 = new PayManager();
		p1.calcPay();
		test(p1.createIterator());
		
		SalaryAggregate sal = new SalaryAggregate();
		sal.calcSalary();
		test(sal.createIterator());
	}
	
	private static void test(Iterator it) {
		it.first();
		while(!it.isDone()) {
			System.out.println(it.currentItem());
			it.next();
		}
	}
}
