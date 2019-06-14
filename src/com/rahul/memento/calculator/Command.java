package com.rahul.memento.calculator;

public interface Command {

	/**
	 * 执行命令
	 */
	void execute();
	/**
	 * 撤销命令，恢复到备忘录对象记录的状态
	 * @param m
	 */
	void undo(Memento m);
	
	void redo(Memento m);
	
	Memento createMemento();
	
	void setOperation(OperationApi operation);
}
