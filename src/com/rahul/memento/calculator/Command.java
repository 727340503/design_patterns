package com.rahul.memento.calculator;

public interface Command {

	/**
	 * ִ������
	 */
	void execute();
	/**
	 * ��������ָ�������¼�����¼��״̬
	 * @param m
	 */
	void undo(Memento m);
	
	void redo(Memento m);
	
	Memento createMemento();
	
	void setOperation(OperationApi operation);
}
