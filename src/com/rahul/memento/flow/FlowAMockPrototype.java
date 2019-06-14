package com.rahul.memento.flow;

import java.io.Serializable;

/**
 * 与原型模式结合
 * @author RahulRui
 *
 */
public class FlowAMockPrototype implements Cloneable,Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -9082955259611440617L;
	private String flowName;
	private int tempResult;
	private String tempState;

	public FlowAMockPrototype(String flowName) {
		this.flowName = flowName;
	}

	public void runPhaseOne() {
		this.tempResult = 3;
		this.tempState = "PhaseOne";
	}

	public void schema1() {
		this.tempState += ",Schema1";
		System.out.println(this.tempState + ":now run " + this.tempResult);
		this.tempResult += 11;
	}

	public void schema2() {
		this.tempState += ",Schema2";
		System.out.println(this.tempState + ":now run " + this.tempResult);
		this.tempResult += 22;
	}

	public String getFlowName() {
		return flowName;
	}

	public void setFlowName(String flowName) {
		this.flowName = flowName;
	}

	public Memento createMemento() {
		try {
			return new MementoImpl((FlowAMockPrototype)this.clone());
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public void setMemento(Memento memento) {
		MementoImpl mementoImpl = (MementoImpl) memento;

		this.tempResult = mementoImpl.getMock().tempResult;
		this.tempState = mementoImpl.getMock().tempState;
	}

	private static class MementoImpl implements Memento {
		/**
		 * 
		 */
		private static final long serialVersionUID = -6841603456064566853L;
		private FlowAMockPrototype mock;
		
		public MementoImpl(FlowAMockPrototype mock) {
			this.mock = mock;
		}
		
		public FlowAMockPrototype getMock() {
			return mock;
		}
	}
}
