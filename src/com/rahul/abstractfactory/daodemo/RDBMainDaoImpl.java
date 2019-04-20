package com.rahul.abstractfactory.daodemo;

public class RDBMainDaoImpl implements OrderMainDao{

	@Override
	public void save() {
		System.out.println("Now in RDB save..............");
	}

}
