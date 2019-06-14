package com.rahul.state.leave;

import java.util.Scanner;

/**
 * 部门经理审核类
 * @author RahulRui
 *
 */
public class DepManagerState implements State{

	@SuppressWarnings({"resource" })
	@Override
	public void doWork(StateMachine request) {
		LeaveRequestModule module = (LeaveRequestModule) request.getBusinessVo();
		
		System.out.println("部门经理审核中.....");
		
		System.out.println(module.getUser() + "申请人" + module.getBeginDate() + "开始请假"  + module.getLeaveDays() + "天,清项目经理审核(1:同意，2:不同意):");
		
		Scanner scanner = new Scanner(System.in);
		if(scanner.hasNext()) {
			int a = scanner.nextInt();
			
			String result = "不同意";
			if(a == 1) {
				result = "同意";
			}
			module.setResult("部门经理审核结果:"+result);
			
			//部门经理审核过后，直接转向审核结束状态。
			request.setState(new AuditOverState());
			request.doWork();
		}
		
	}

}
