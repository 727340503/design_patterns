package com.rahul.mediator.dept;

import java.util.ArrayList;
import java.util.List;

/**
 * 实现部门和人员交互的中介者实现类
 * 只示例撤销部门和人员离职的功能
* @ClassName: DeptUserMediatorImpl
* @Description: TODO(这里用一句话描述这个类的作用)
* @author rahul
* @date 2018年8月7日
*
 */
public class DeptUserMediatorImpl {
	private static DeptUserMediatorImpl mediator = new DeptUserMediatorImpl();
	private DeptUserMediatorImpl() {
		initTestData();
	}
	
	public static DeptUserMediatorImpl getInstance() {
		return mediator;
	}
	// 测试用，记录部门和人员的关系
	private List<DeptUserModel> depUsers = new ArrayList<DeptUserModel>();
	
	private void initTestData() {
		DeptUserModel du1 = new DeptUserModel();
		du1.setDepUserId("1");
		du1.setDepId("1");
		du1.setUserId("1");
		
		DeptUserModel du2 = new DeptUserModel();
		du2.setDepUserId("2");
		du2.setDepId("2");
		du2.setUserId("2");

		DeptUserModel du3 = new DeptUserModel();
		du3.setDepUserId("2");
		du3.setDepId("2");
		du3.setUserId("1");
		
		DeptUserModel du4 = new DeptUserModel();
		du4.setDepUserId("2");
		du4.setDepId("3");
		du4.setUserId("3");
		
		depUsers.add(du1);
		depUsers.add(du2);
		depUsers.add(du3);
		depUsers.add(du4);
	}
	
	public List<DeptUserModel> getUserList(){
		return this.depUsers;
	}

	public boolean delDept(String deptId) {
		List<DeptUserModel> delList = new ArrayList<DeptUserModel>();
		for(DeptUserModel model : depUsers) {
			if(model.getDepId().equalsIgnoreCase(deptId)){
				delList.add(model);
			}
		}
		
		depUsers.removeAll(delList);
		return true;
	}
	
	public boolean delUser(String userId) {
		
		List<DeptUserModel> delList = new ArrayList<DeptUserModel>();
		for(DeptUserModel model : depUsers) {
			if(model.getDepId().equalsIgnoreCase(userId)){
				delList.add(model);
			}
		}
		//删除部分user关系
		depUsers.removeAll(delList);
		
		return true;
	}
	
}
