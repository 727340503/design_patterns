package com.rahul.abstractfactory.daodemo;

public class Client {

	public static void main(String[] args) {
		DaoFactory df = new XMLDaoFactoryImpl();
		
		OrderMainDao orderMainDao = df.createMainDao();
		OrderDetailDao detailDao = df.createDetailDao();
		
		
	}
	
}
