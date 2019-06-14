package com.rahul.memento.calculator;

/**
 * 运算类，真正实现加减法运算
 * 原发器
 * @author RahulRui
 *
 */
public class Operation implements OperationApi{
	
	private int result;

	@Override
	public int getResult() {
		return result;
	}

	@Override
	public void add(int num) {
		this.result += num;
	}

	@Override
	public void substract(int num) {
		this.result -= num;
	}
	
	public Memento createMemento() {
		return new MementoImpl(this.result);
	}
	
	public void setMemento(Memento memento) {
		MementoImpl mementoImpl = (MementoImpl) memento;
		this.result = mementoImpl.getResult();
	}
	
	private static class MementoImpl implements Memento{
		
		private int result = 0;
		
		public MementoImpl(int result) {
			this.result = result;
		}
		
		public int getResult() {
			return this.result;
		}
		
	}

}
