package com.rahul.mediator.dept;

public class Dept {
	private String depId;

	private String name;

	public String getDepId() {
		return depId;
	}

	public void setDepId(String depId) {
		this.depId = depId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean delDep() {
		DeptUserMediatorImpl mediator = DeptUserMediatorImpl.getInstance();
		mediator.delDept(depId);
		return true;
	}
	
}
