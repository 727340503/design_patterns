package com.rahul.simplefactory;

/**
 * �ӿ���ʵ��B
 * @author rahul
 *
 */
public class ImplB implements Api{

	@Override
	public void operation(String s) {
		System.out.println("ImplB s=="+s);
	}

}
