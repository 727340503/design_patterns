package com.rahul.builder.baoxianhetong1;

public class Client {
	public static void main(String[] args) {
		InsuranceContract ins = new ConcreteBuilder("1", 1234L).setPersonName("zhangsan").setOtherData("123").build();
		ins.test();
	}
}
