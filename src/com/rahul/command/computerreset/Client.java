package com.rahul.command.computerreset;

/**
 * 参数化配置
* @ClassName: Client
* @Description: TODO(这里用一句话描述这个类的作用)
* @author rahul
* @date 2018年9月6日
*
 */
public class Client {
	public static void main(String[] args) {
		/**
		 * 组装电脑
		 */
		GigaMainBoard board = new GigaMainBoard();
		Command command = new OpenCommand(board);
		Command resetCommand = new ResetCommand(board);
		
		
		/**
		 * 实现的是客户端功能，调用开机按钮
		 */
		Box box = new Box();
		
		System.out.println("正确配置下的运行-------------------");
		box.setCommand(command);
		box.setResetCommand(resetCommand);
		
		box.openButtonPressed();
		box.resetButtonPressed();
		
		System.out.println("错误配置下的运行------------------------");
		box.setCommand(resetCommand);
		box.setResetCommand(command);
		box.openButtonPressed();
		box.resetButtonPressed();
	}
}
