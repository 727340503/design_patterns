package com.rahul.state.leave;

import java.util.Scanner;

/**
 * ���ž��������
 * @author RahulRui
 *
 */
public class DepManagerState implements State{

	@SuppressWarnings({"resource" })
	@Override
	public void doWork(StateMachine request) {
		LeaveRequestModule module = (LeaveRequestModule) request.getBusinessVo();
		
		System.out.println("���ž��������.....");
		
		System.out.println(module.getUser() + "������" + module.getBeginDate() + "��ʼ���"  + module.getLeaveDays() + "��,����Ŀ�������(1:ͬ�⣬2:��ͬ��):");
		
		Scanner scanner = new Scanner(System.in);
		if(scanner.hasNext()) {
			int a = scanner.nextInt();
			
			String result = "��ͬ��";
			if(a == 1) {
				result = "ͬ��";
			}
			module.setResult("���ž�����˽��:"+result);
			
			//���ž�����˹���ֱ��ת����˽���״̬��
			request.setState(new AuditOverState());
			request.doWork();
		}
		
	}

}
