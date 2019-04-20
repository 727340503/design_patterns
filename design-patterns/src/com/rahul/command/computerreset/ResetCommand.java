package com.rahul.command.computerreset;

/**
 * 开机命令的实现
* @ClassName: OpenCommand
* @Description: TODO(这里用一句话描述这个类的作用)
* @author rahul
* @date 2018年9月6日
*
 */
public class ResetCommand implements Command{

	private MainBoardApi mainBoardApi;
	
	/**
	 * 传入主板对象
	* 创建一个新的实例 OpenCommand.
	*
	* @param mainBoardApi
	 */
	public ResetCommand(MainBoardApi mainBoardApi) {
		this.mainBoardApi = mainBoardApi;
	}
	
	/**
	 * 通过主板启动电脑
	 */
	@Override
	public void execute() {
		mainBoardApi.reset();
	}

}
