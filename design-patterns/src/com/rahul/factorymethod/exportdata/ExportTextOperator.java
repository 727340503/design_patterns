package com.rahul.factorymethod.exportdata;

public class ExportTextOperator extends ExportOperator{

	@Override
	protected ExportFileApi factoryMethod() {
		return new ExportText();
	}
	
}
