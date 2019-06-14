package com.rahul.state.leave;

public class StateMachine {

	/**
	 * 持有一个状态对象
	 */
	private State state;

	/**
	 * 包含流程处理需要的业务数据对象
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
