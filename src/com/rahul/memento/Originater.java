package com.rahul.memento;

/**
 * 原发器对象
 * @author RahulRui
 *
 */
public class Originater {

	private String state = "";
	
	public Memento createMemento() {
		return new MementoImpl(state);
	}
	
	public void setMemento(Memento memento) {
		MementoImpl mementoImpl = (MementoImpl) memento;
		this.state = mementoImpl.getState();
	}
	
	/**
	 * 真正的备忘录对象，实现备忘录窄接口
	 * @author RahulRui
	 *
	 */
	private static class MementoImpl implements Memento{
		private String state = "";
		
		public MementoImpl(String state) {
			this.state = state;
		}
		
		public String getState() {
			return this.state;
		}
		
	}
	
}
