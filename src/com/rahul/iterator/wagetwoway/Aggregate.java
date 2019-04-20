package com.rahul.iterator.wagetwoway;
/**
 * 聚合对象的接口，定义创建相应迭代器对象的接口
* @ClassName: Aggregate
* @Description: TODO(这里用一句话描述这个类的作用)
* @author rahul
* @date 2018年9月11日
*
 */
public interface Aggregate {
	public Iterator createIterator();
}
