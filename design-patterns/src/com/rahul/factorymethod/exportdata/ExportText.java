package com.rahul.factorymethod.exportdata;

public class ExportText implements ExportFileApi{

	@Override
	public boolean export(String data) {
		System.out.println("Now  export data to file.......");
		return true;
	}
	
}
