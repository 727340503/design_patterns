package com.rahul.factorymethod.exportdata.param;

public class ExportDB implements ExportFileApi{

	@Override
	public boolean export(String data) {
		System.out.println("Now  export data to DB.......");
		return true;
	}
	
}
