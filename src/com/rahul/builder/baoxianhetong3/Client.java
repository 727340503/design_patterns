package com.rahul.builder.baoxianhetong3;
/**
 * ���ڵ����⣺ͬ���»�����ͨ��new�������������պ�ͬ������ȫ����Ҫ��build�ŵ����պ�ͬ���в������պ�ͬ������˽�л������demo3
* @ClassName: Client
* @Description: TODO(������һ�仰��������������)
* @author rahul
* @date 2018��8��3��
*
 */
public class Client {
	public static void main(String[] args) {
		InsuranceContract ins = new InsuranceContract.ConcreteBuilder("1", 1234L)
//										.setPersonName("zhangsan")
										.setOtherData("123")
										.setCompanyName("123").build();
		ins.test();
	}
}
