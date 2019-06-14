package com.rahul.state.leave;

public class Client {
	public static void main(String[] args) {
		LeaveRequestModule module = new LeaveRequestModule();
		module.setUser("уехЩ");
		module.setBeginDate("2019-06-13");
		module.setLeaveDays(2);
		
		State state = new ProjectManagerState();
		
		StateMachine machine = new StateMachine();
		machine.setBusinessVo(module);
		machine.setState(state);
		
		machine.doWork();
	}
}
