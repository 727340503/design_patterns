package com.rahul.simplefactory;

/**
 * �ӿ���ʵ��A
 * @author rahul
 *
 */
public class ImplA implements Api{

	@Override
	public void operation(String s) {
		System.out.println("ImplA s=="+s);
	}

}
