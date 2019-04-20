package com.rahul.iterator.javafilter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayIteratorImpl implements Iterator<PayModel>{

	private PayModel[] payModels;
	
	public ArrayIteratorImpl(SalaryAggregate salaryManager) {
		List<PayModel> pays = new ArrayList<PayModel>();
		for(PayModel pay : salaryManager.getPays()) {
			if(pay.getPay() < 3000) {
				pays.add(pay);
			}
		}
		
		this.payModels = new PayModel[pays.size()];
		for(int i=0; i<pays.size(); i++) {
			payModels[i] = pays.get(i);
		}
	}
	
	private int index = -1;
	
	@Override
	public boolean hasNext() {
		index ++;
		if(index < payModels.length) {
			return true;
		}
		return false;
	}

	@Override
	public PayModel next() {
		if(index < payModels.length) {
			return payModels[index];
		}
		return null;
	}

}
