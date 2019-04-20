package com.rahul.builder.exportdata;

import java.util.List;
import java.util.Map;

/**
 * ָ���ߣ�ָ��ʹ�ù������Ľӿ�������������ļ��Ķ���
* @ClassName: Director
* @Description: TODO(������һ�仰��������������)
* @author rahul
* @date 2018��8��3��
*
 */
public class Director {
	/**
	 * ���е�ǰ��Ҫʹ�õĹ�������
	 */
	private Builder builder;

	/**
	 * ���췽�������빹������
	* ����һ���µ�ʵ�� Director.
	*
	* @param builder
	 */
	public Director(Builder builder) {
		this.builder = builder;
	}
	
	/**
	 * ָ������������������ļ����󣬶��ң����Զ��ļ�������������װ�����磬���Բ�Ҫheader��Ҳ���Բ�Ҫbody�ȵȣ�ֻ��Ҫ�Զ��弴��
	 * @author rahul.rui
	 * @date 2018��8��3��
	 * @param ehm
	 * @param mapData
	 * @param efm
	 * @return void
	 *
	 */
	public void  construct(ExportHeaderModel ehm, Map<String, List<ExportDataModel>> mapData,ExportFooterModel efm){
		builder.buildHearder(ehm);
		builder.buildBody(mapData);
		builder.buildFooter(efm);
	}
	
}
