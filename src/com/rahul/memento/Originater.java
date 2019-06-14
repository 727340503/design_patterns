package com.rahul.memento;

/**
 * ԭ��������
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
	 * �����ı���¼����ʵ�ֱ���¼խ�ӿ�
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
