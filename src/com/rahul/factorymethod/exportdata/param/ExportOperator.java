package com.rahul.factorymethod.exportdata.param;

public class ExportOperator {
	
	protected ExportFileApi factoryMethod(int type) {
		if(type == 1) {
			return new ExportDB();
		}else if(type == 2) {
			return new ExportText();
		}
		
		return null;
	};

	public void saveData(int type,String data) {
		
		ExportFileApi api = factoryMethod(type);
		
		api.export(data);
	
	}
}
