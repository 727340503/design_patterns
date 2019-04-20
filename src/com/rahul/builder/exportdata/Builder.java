package com.rahul.builder.exportdata;

import java.util.List;
import java.util.Map;

public interface Builder {
	/**
	 * �ս��ļ���header����
	 * @author rahul.rui
	 * @date 2018��8��3��
	 * @return void
	 *
	 */
	void buildHearder(ExportHeaderModel ehm);
		
	/**
	 * �����ļ�body����
	 * @author rahul.rui
	 * @date 2018��8��3��
	 * @return void
	 *
	 */
	void buildBody(Map<String,List<ExportDataModel>> mapData);
	
	/**
	 * �����ļ���footer����
	 * @author rahul.rui
	 * @date 2018��8��3��
	 * @return void
	 *
	 */
	void buildFooter(ExportFooterModel efm);
	
	StringBuffer getResult();
	
}
