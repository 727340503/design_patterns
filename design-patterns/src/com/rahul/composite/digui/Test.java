package com.rahul.composite.digui;

/**
 * �׳˵ݹ��㷨
* @ClassName: Test
* @Description: TODO(������һ�仰��������������)
* @author rahul
* @date 2018��9��14��
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
