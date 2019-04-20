package com.rahul.factorymethod.exportdata;

public class ExportDBOperator extends ExportOperator{

	@Override
	protected ExportFileApi factoryMethod() {
		return new ExportDB();
	}
	
}
