package com.rahul.factorymethod.exportdata.param;

public class ExportXML implements ExportFileApi{

	@Override
	public boolean export(String data) {
		System.out.println("Now  export data to XML.......");
		return true;
	}
	
}
