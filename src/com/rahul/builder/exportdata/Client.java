package com.rahul.builder.exportdata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Client {
	
	public static void main(String[] args) {
		Map<String, List<ExportDataModel>> mapData = new HashMap<String, List<ExportDataModel>>();	
		for(int i=0; i<10; i++) {
			List<ExportDataModel> edms = new ArrayList<>();
			ExportDataModel edm = new ExportDataModel();
			edm.setProductid(1L);
			edm.setPrice(1.0+i);
			edms.add(edm);
			
			mapData.put("key"+i, edms);
		}
		
		ExportHeaderModel ehm = new ExportHeaderModel();
		ehm.setDepId("1");
		ehm.setExportDate("2018-07-02");
		
		ExportFooterModel efm = new ExportFooterModel();
		efm.setExportUser("Testing");
		
		Builder builder = new TxtBuilder();
		Director d = new Director(builder);
		d.construct(ehm, mapData, efm);

		Builder builder2 = new XmlBuilder();
		Director d2 = new Director(builder2);
		d2.construct(ehm, mapData, efm);
	}
	
}
