package com.rahul.memento.flow;

public class Client {
	public static void main(String[] args) {
		//创建模拟运行流程对象
//		FlowAMock mock = new FlowAMock("Flow");
		FlowAMockPrototype mock = new FlowAMockPrototype("Flow");
		//运行流程的第一个阶段
		mock.runPhaseOne();
		
		
		//创建一个管理者
//		FlowAMementoCareTaker taker = new FlowAMementoCareTaker();
		FlowAMementoFileCareTaker taker = new FlowAMementoFileCareTaker();
		//创建此时对象的备忘录对象，并保存到管理者对象那里，后面要用
		taker.saveMemento(mock.createMemento());
		
		//按照方案1运行流程
		mock.schema1();
		
		//从管理者获取备忘录对象，设置回去
		mock.setMemento(taker.retiveMemento());
		
		//按照方案2运行流程
		mock.schema2();
	}
}
