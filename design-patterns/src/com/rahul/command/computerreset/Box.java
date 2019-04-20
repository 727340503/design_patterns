package com.rahul.command.computerreset;
/**
 * �������
* @ClassName: Box
* @Description: TODO(������һ�仰��������������)
* @author rahul
* @date 2018��9��6��
*
 */
public class Box {
	private Command command;
	
	private Command resetCommand;

	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void setResetCommand(Command command) {
		this.resetCommand = command;
	}
	
	/**
	 * �ṩ���ͻ�ʹ��
	 * @author rahul.rui
	 * @date 2018��9��6��
	 * @return void
	 *
	 */
	public  void openButtonPressed() {
		//���°�ť��ִ������
		command.execute();
	}
	
	
	public void resetButtonPressed() {
		resetCommand.execute();
	}
	
}
