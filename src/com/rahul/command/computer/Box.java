package com.rahul.command.computer;
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

	public void setCommand(Command command) {
		this.command = command;
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
	
}
