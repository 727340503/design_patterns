package com.rahul.command;
/**
 * ������
* @ClassName: Invoker
* @Description: TODO(������һ�仰��������������)
* @author rahul
* @date 2018��9��6��
*
 */
public class Invoker {

	/**
	 * �����������
	 */
	private Command command;

	/**
	 * ���õ����߳��е��������
	 * @author rahul.rui
	 * @date 2018��9��6��
	 * @param command
	 * @return void
	 *
	 */
	public void setCommand(Command command) {
		this.command = command;
	}
	
	/**
	 * Ҫ������ִ������
	 * @author rahul.rui
	 * @date 2018��9��6��
	 * @return void
	 *
	 */
	public void runCommand() {
		//������������ִ�з���
		command.execute();
	}

}
