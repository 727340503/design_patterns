package com.rahul.simplefactory.properties;

/**
 * 接口类实现B
 * @author rahul
 *
 */
public class ImplB implements Api{

	@Override
	public void operation(String s) {
		System.out.println("ImplB s=="+s);
	}

}
