package com.rahul.iterator.wagetwoway;

/**
 * �������ӿ�
* @ClassName: Iterator
* @Description: TODO(������һ�仰��������������)
* @author rahul
* @date 2018��9��11��
*
 */
public interface Iterator {
	
	public void first();
	
	public void next();
	
	public boolean isDone();
	
	public Object currentItem();
	
	public void last();
	
	public boolean isFirst();
	
	public void previous();

}
