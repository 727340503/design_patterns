package com.rahul.command.computer;

public class Client {
	public static void main(String[] args) {
		/**
		 * ��װ����
		 */
		GigaMainBoard board = new GigaMainBoard();
		Command command = new OpenCommand(board);
		
		
		/**
		 * ʵ�ֵ��ǿͻ��˹��ܣ����ÿ�����ť
		 */
		Box box = new Box();
		box.setCommand(command);
		
		box.openButtonPressed();
	}
}
