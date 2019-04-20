package com.rahul.abstractfactory.daodemo;

public class XMLDaoFactoryImpl implements DaoFactory{

	@Override
	public OrderMainDao createMainDao() {
		return new XMLMainDaoImpl();
	}

	@Override
	public OrderDetailDao createDetailDao() {
		return new XMLDetailDaoImpl();
	}

}
