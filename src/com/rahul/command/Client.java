package com.rahul.command;

/**
 * ����ģʽ
 * @author RahulRui
 *
 */
public class Client {
	public void assemble() {
		Receiver receiver = new Receiver();
		Command command = new ConcreateCommand(receiver);
		
		//�����������Ŀͻ����õ����
		Invoker invoker = new Invoker();
		invoker.setCommand(command);
	}
}
