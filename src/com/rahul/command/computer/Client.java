package com.rahul.command.computer;

public class Client {
	public static void main(String[] args) {
		/**
		 * 组装电脑
		 */
		GigaMainBoard board = new GigaMainBoard();
		Command command = new OpenCommand(board);
		
		
		/**
		 * 实现的是客户端功能，调用开机按钮
		 */
		Box box = new Box();
		box.setCommand(command);
		
		box.openButtonPressed();
	}
}
