package com.rahul.command;
/**
 * 调用者
* @ClassName: Invoker
* @Description: TODO(这里用一句话描述这个类的作用)
* @author rahul
* @date 2018年9月6日
*
 */
public class Invoker {

	/**
	 * 持有命令对象
	 */
	private Command command;

	/**
	 * 设置调用者持有的命令对象
	 * @author rahul.rui
	 * @date 2018年9月6日
	 * @param command
	 * @return void
	 *
	 */
	public void setCommand(Command command) {
		this.command = command;
	}
	
	/**
	 * 要求命令执行请求
	 * @author rahul.rui
	 * @date 2018年9月6日
	 * @return void
	 *
	 */
	public void runCommand() {
		//调用命令对象的执行方法
		command.execute();
	}

}
