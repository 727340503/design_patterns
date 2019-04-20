package com.rahul.composite.digui;

/**
 * 阶乘递归算法
* @ClassName: Test
* @Description: TODO(这里用一句话描述这个类的作用)
* @author rahul
* @date 2018年9月14日
*
 */
public class Test {

	public static int revursive(int a) {
		if(a == 1) {
			return 1;
		}
		
		return a * revursive(a-1);
	}
	
	public static void main(String[] args) {
		System.out.println(revursive(5));
	}
}
