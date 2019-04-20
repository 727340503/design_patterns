package com.rahul.command.computerreset;
/**
 * 机箱对象
* @ClassName: Box
* @Description: TODO(这里用一句话描述这个类的作用)
* @author rahul
* @date 2018年9月6日
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
	 * 提供给客户使用
	 * @author rahul.rui
	 * @date 2018年9月6日
	 * @return void
	 *
	 */
	public  void openButtonPressed() {
		//按下按钮，执行命令
		command.execute();
	}
	
	
	public void resetButtonPressed() {
		resetCommand.execute();
	}
	
}
