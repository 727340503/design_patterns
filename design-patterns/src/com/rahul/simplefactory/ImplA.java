package com.rahul.simplefactory;

/**
 * 接口类实现A
 * @author rahul
 *
 */
public class ImplA implements Api{

	@Override
	public void operation(String s) {
		System.out.println("ImplA s=="+s);
	}

}
