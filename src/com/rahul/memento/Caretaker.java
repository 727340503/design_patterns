package com.rahul.memento;

/**
 * ���汸��¼�Ķ���
 * @author RahulRui
 *
 */
public class Caretaker {
	
	/**
	 * ��¼������ı���¼����
	 */
	private Memento memento;
	
	public void saveMemento(Memento memento) {
		this.memento = memento;
	}
	
	public Memento retiveMemento() {
		return memento;
	}
	
}
