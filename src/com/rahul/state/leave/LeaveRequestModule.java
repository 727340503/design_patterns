package com.rahul.state.leave;

public class LeaveRequestModule {
	/**
	 * �����
	 */
	private String user;
	/**
	 * ���ʱ��
	 */
	private String beginDate;
	/**
	 * �������
	 */
	private int leaveDays;
	
	/**
	 * ��ٽ��
	 */
	private String result;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}

	public int getLeaveDays() {
		return leaveDays;
	}

	public void setLeaveDays(int leaveDays) {
		this.leaveDays = leaveDays;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

}
