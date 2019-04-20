package com.rahul.builder.exportdata;

import java.util.List;
import java.util.Map;

/**
 * 指导者，指导使用构建器的接口来构建输出的文件的对象
* @ClassName: Director
* @Description: TODO(这里用一句话描述这个类的作用)
* @author rahul
* @date 2018年8月3日
*
 */
public class Director {
	/**
	 * 持有当前需要使用的构建对象
	 */
	private Builder builder;

	/**
	 * 构造方法，传入构建对象
	* 创建一个新的实例 Director.
	*
	* @param builder
	 */
	public Director(Builder builder) {
		this.builder = builder;
	}
	
	/**
	 * 指导构建器最终输出的文件对象，而且，可以对文件对象进行任意改装，比如，可以不要header，也可以不要body等等，只需要自定义即可
	 * @author rahul.rui
	 * @date 2018年8月3日
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
