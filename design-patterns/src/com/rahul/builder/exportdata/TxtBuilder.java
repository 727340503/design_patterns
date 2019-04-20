package com.rahul.builder.exportdata;

import java.util.List;
import java.util.Map;

public class TxtBuilder implements Builder{

	/**
	 * 记录文件内容，相当于产品
	 */
	private StringBuffer buffer = new StringBuffer();
	
	@Override
	public void buildHearder(ExportHeaderModel ehm) {
		buffer.append(ehm.getDepId() + "," + ehm.getExportDate() + "\n");
	}

	@Override
	public void buildBody(Map<String,List<ExportDataModel>> mapData) {
		for(String tblName : mapData.keySet()) {
			buffer.append(tblName +"\n");
			
			for(ExportDataModel edm : mapData.get(tblName)) {
				buffer.append(edm.getProductid() + "," + edm.getPrice() + "\n");
			}
		}
	}

	@Override
	public void buildFooter(ExportFooterModel efm) {
		buffer.append(efm.getExportUser());
	}
	
	public StringBuffer getResult() {
		return this.buffer;
	}

}
