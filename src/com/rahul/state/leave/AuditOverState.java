package com.rahul.state.leave;

/**
 * ������˽�������
 * @author RahulRui
 *
 */
public class AuditOverState implements State{

	@Override
	public void doWork(StateMachine request) {
		LeaveRequestModule module = (LeaveRequestModule) request.getBusinessVo();
		//ҵ���������������¼�������̼�����
		System.out.println("�����������ѽ���������ǣ�" + module.getResult());
	}

}
