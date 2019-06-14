package com.rahul.state.leave;

import java.util.Scanner;

/**
 * ��Ŀ���������
 * @author RahulRui
 *
 */
public class ProjectManagerState implements State{

	@SuppressWarnings("resource")
	@Override
	public void doWork(StateMachine request) {
		LeaveRequestModule module = (LeaveRequestModule) request.getBusinessVo();
		
		System.out.println("��Ŀ���������.....");
		
		System.out.println(module.getUser() + "������" + module.getBeginDate() + "��ʼ���"  + module.getLeaveDays() + "��,����Ŀ�������(1:ͬ�⣬2:��ͬ��):");
		
		Scanner scanner = new Scanner(System.in);
		if(scanner.hasNext()) {
			int a = scanner.nextInt();
			
			String result = "��ͬ��";
			if(a == 1) {
				result = "ͬ��";
			}
			module.setResult("��Ŀ������˽��:"+result);
			
			if(a == 1) {
				if(module.getLeaveDays() >= 3) {
					//3��֮�����ˣ���Ҫת���ž���
					request.setState(new DepManagerState());
					//����ִ����һ������
					request.doWork();
				}else {
					// 3�����ڵ���٣�����Ҫת���ž���ת����ˣ�����״̬
					request.setState(new AuditOverState());
					//����ִ����һ������
					request.doWork();
				}
			}else {
				//��Ŀ����ͬ��Ͳ���Ҫ��֪���ž���ת����ˣ�����״̬
				request.setState(new AuditOverState());
				//����ִ����һ������
				request.doWork();
			}
			
		}
	}

}
