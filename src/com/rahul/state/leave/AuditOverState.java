package com.rahul.state.leave;

/**
 * 处理审核结束的类
 * @author RahulRui
 *
 */
public class AuditOverState implements State{

	@Override
	public void doWork(StateMachine request) {
		LeaveRequestModule module = (LeaveRequestModule) request.getBusinessVo();
		//业务处理，在数据里面记录整个流程激光束
		System.out.println("你的请假申请已结束，结果是：" + module.getResult());
	}

}
