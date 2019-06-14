package com.rahul.state.leave;

import java.util.Scanner;

/**
 * 项目经理审核类
 * @author RahulRui
 *
 */
public class ProjectManagerState implements State{

	@SuppressWarnings("resource")
	@Override
	public void doWork(StateMachine request) {
		LeaveRequestModule module = (LeaveRequestModule) request.getBusinessVo();
		
		System.out.println("项目经理审核中.....");
		
		System.out.println(module.getUser() + "申请人" + module.getBeginDate() + "开始请假"  + module.getLeaveDays() + "天,清项目经理审核(1:同意，2:不同意):");
		
		Scanner scanner = new Scanner(System.in);
		if(scanner.hasNext()) {
			int a = scanner.nextInt();
			
			String result = "不同意";
			if(a == 1) {
				result = "同意";
			}
			module.setResult("项目经理审核结果:"+result);
			
			if(a == 1) {
				if(module.getLeaveDays() >= 3) {
					//3天之外的审核，需要转向部门经理
					request.setState(new DepManagerState());
					//继续执行下一步工作
					request.doWork();
				}else {
					// 3天以内的请假，不需要转向部门经理，转向审核，结束状态
					request.setState(new AuditOverState());
					//继续执行下一步工作
					request.doWork();
				}
			}else {
				//项目经理不同意就不需要告知部门经理，转向审核，结束状态
				request.setState(new AuditOverState());
				//继续执行下一步工作
				request.doWork();
			}
			
		}
	}

}
