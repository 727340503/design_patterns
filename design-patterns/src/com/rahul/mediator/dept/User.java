package com.rahul.mediator.dept;

public class User {
	private String userId;
	private String name;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * ��Ա��ְ
	 * @author rahul.rui
	 * @date 2018��8��8��
	 * @return void
	 *
	 */
	public boolean dimission() {
		DeptUserMediatorImpl mediator = DeptUserMediatorImpl.getInstance();
		mediator.delUser(userId);
		
		return true;
	}

}
