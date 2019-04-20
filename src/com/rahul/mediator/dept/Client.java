package com.rahul.mediator.dept;

public class Client {
	public static void main(String[] args) {
		DeptUserMediatorImpl mediator = DeptUserMediatorImpl.getInstance();
		System.out.println(mediator.getUserList().size());

		mediator.delDept("1");
		
		System.out.println(mediator.getUserList().size());
	}
}
