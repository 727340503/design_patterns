package com.rahul.factorymethod.exportdata;

public abstract class ExportOperator {
	
	protected abstract ExportFileApi factoryMethod();

	public void saveData(String data) {
		
		ExportFileApi api = factoryMethod();
		
		api.export(data);
	
	}
}
