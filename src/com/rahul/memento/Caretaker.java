package com.rahul.memento;

/**
 * 保存备忘录的对象
 * @author RahulRui
 *
 */
public class Caretaker {
	
	/**
	 * 记录被保存的备忘录对象
	 */
	private Memento memento;
	
	public void saveMemento(Memento memento) {
		this.memento = memento;
	}
	
	public Memento retiveMemento() {
		return memento;
	}
	
}
