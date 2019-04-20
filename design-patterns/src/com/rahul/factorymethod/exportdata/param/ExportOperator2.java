package com.rahul.factorymethod.exportdata.param;

public class ExportOperator2 extends ExportOperator{
	
	protected ExportFileApi factoryMethod(int type) {
		if(type == 3) {
			return new ExportXML();
		}else{
			return super.factoryMethod(type);
		}
	};
}
