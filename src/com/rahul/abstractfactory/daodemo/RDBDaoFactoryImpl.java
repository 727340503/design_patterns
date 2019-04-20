package com.rahul.abstractfactory.daodemo;

public class RDBDaoFactoryImpl implements DaoFactory{

	@Override
	public OrderMainDao createMainDao() {
		return new RDBMainDaoImpl();
	}

	@Override
	public OrderDetailDao createDetailDao() {
		return new RDBDetailDaoImpl();
	}

}
