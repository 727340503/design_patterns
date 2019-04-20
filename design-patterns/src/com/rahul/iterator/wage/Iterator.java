package com.rahul.iterator.wage;

/**
 * 迭代器接口
* @ClassName: Iterator
* @Description: TODO(这里用一句话描述这个类的作用)
* @author rahul
* @date 2018年9月11日
*
 */
public interface Iterator {
	
	public void first();
	
	public void next();
	
	public boolean isDone();
	
	public Object currentItem();

}
