package com.rahul.iterator.java;

import java.util.Iterator;

public class Client {
	public static void main(String[] args) {
		PayManager p1 = new PayManager();
		p1.calcPay();
		test(p1.createIterator());
		
		SalaryAggregate sal = new SalaryAggregate();
		sal.calcSalary();
		test(sal.createIterator());
	}
	
	private static void test(Iterator<PayModel> it) {
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
