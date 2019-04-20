package com.rahul.abstractfactory.daodemo;

public interface DaoFactory {
	
	OrderMainDao createMainDao();

	OrderDetailDao createDetailDao();
}
