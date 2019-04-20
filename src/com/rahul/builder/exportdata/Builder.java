package com.rahul.builder.exportdata;

import java.util.List;
import java.util.Map;

public interface Builder {
	/**
	 * 凑建文件的header部分
	 * @author rahul.rui
	 * @date 2018年8月3日
	 * @return void
	 *
	 */
	void buildHearder(ExportHeaderModel ehm);
		
	/**
	 * 构建文件body部分
	 * @author rahul.rui
	 * @date 2018年8月3日
	 * @return void
	 *
	 */
	void buildBody(Map<String,List<ExportDataModel>> mapData);
	
	/**
	 * 构建文件的footer部分
	 * @author rahul.rui
	 * @date 2018年8月3日
	 * @return void
	 *
	 */
	void buildFooter(ExportFooterModel efm);
	
	StringBuffer getResult();
	
}
