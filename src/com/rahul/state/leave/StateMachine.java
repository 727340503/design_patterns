package com.rahul.state.leave;

public class StateMachine {

	/**
	 * ����һ��״̬����
	 */
	private State state;

	/**
	 * �������̴�����Ҫ��ҵ�����ݶ���
	 */
	private Object businessVo;

	public void doWork() {
		this.state.doWork(this);
	}

	public Object getBusinessVo() {
		return businessVo;
	}

	public void setBusinessVo(Object businessVo) {
		this.businessVo = businessVo;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

}
