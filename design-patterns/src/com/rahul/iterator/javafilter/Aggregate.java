package com.rahul.iterator.javafilter;

import java.util.Iterator;

/**
 * �ۺ϶���Ľӿڣ����崴����Ӧ����������Ľӿ�
* @ClassName: Aggregate
* @Description: TODO(������һ�仰��������������)
* @author rahul
* @date 2018��9��11��
*
 */
public interface Aggregate {
	public Iterator<PayModel> createIterator();
}
