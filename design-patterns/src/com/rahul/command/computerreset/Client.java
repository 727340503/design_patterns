package com.rahul.command.computerreset;

/**
 * ����������
* @ClassName: Client
* @Description: TODO(������һ�仰��������������)
* @author rahul
* @date 2018��9��6��
*
 */
public class Client {
	public static void main(String[] args) {
		/**
		 * ��װ����
		 */
		GigaMainBoard board = new GigaMainBoard();
		Command command = new OpenCommand(board);
		Command resetCommand = new ResetCommand(board);
		
		
		/**
		 * ʵ�ֵ��ǿͻ��˹��ܣ����ÿ�����ť
		 */
		Box box = new Box();
		
		System.out.println("��ȷ�����µ�����-------------------");
		box.setCommand(command);
		box.setResetCommand(resetCommand);
		
		box.openButtonPressed();
		box.resetButtonPressed();
		
		System.out.println("���������µ�����------------------------");
		box.setCommand(resetCommand);
		box.setResetCommand(command);
		box.openButtonPressed();
		box.resetButtonPressed();
	}
}
