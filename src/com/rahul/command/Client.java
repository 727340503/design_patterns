package com.rahul.command;

/**
 * 命令模式
 * @author RahulRui
 *
 */
public class Client {
	public void assemble() {
		Receiver receiver = new Receiver();
		Command command = new ConcreateCommand(receiver);
		
		//以下是真正的客户调用的入口
		Invoker invoker = new Invoker();
		invoker.setCommand(command);
	}
}
