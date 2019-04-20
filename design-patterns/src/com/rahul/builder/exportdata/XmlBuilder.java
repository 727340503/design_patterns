package com.rahul.builder.exportdata;

import java.util.List;
import java.util.Map;

public class XmlBuilder implements Builder{
	
	/**
	 * 记录文件内容，相当于产品
	 */
	private StringBuffer buffer = new StringBuffer();

	@Override
	public void buildHearder(ExportHeaderModel ehm) {
		buffer.append("  <Header>\n")
				.append("    <DepId>"+ehm.getDepId()+"</DepId>\n")
				.append("    <ExportDate>"+ehm.getExportDate()+"</ExportDate>\n")
				.append("  </Header>\n");
	}

	@Override
	public void buildBody(Map<String,List<ExportDataModel>> mapData) {
		buffer.append("  <Body>\n");
		for(String tblName : mapData.keySet()) {
			buffer.append("    <Datas TableName=\""+tblName+"\"\n");
			
			for(ExportDataModel edm : mapData.get(tblName)) {
				buffer.append("      <Data>\n")
						.append("        <ProductId>"+edm.getProductid()+"</ProductId>\n")
						.append("        <Price>"+edm.getPrice()+"</price>\n")
						.append("      </Data>\n");
			}
			
			buffer.append("    </Datas>\n");
		}
		buffer.append("  </Body>\n");
	}

	@Override
	public void buildFooter(ExportFooterModel efm) {
		buffer.append("  <Footer>\n")
				.append("    <ExportUser>"+efm.getExportUser()+"</ExportUser>\n")
				.append("  </Footer>\n");
		
	}

	@Override
	public StringBuffer getResult() {
		return buffer;
	}

}
