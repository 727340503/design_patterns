package com.rahul.command.computerreset;

/**
 * ���������ʵ��
* @ClassName: OpenCommand
* @Description: TODO(������һ�仰��������������)
* @author rahul
* @date 2018��9��6��
*
 */
public class ResetCommand implements Command{

	private MainBoardApi mainBoardApi;
	
	/**
	 * �����������
	* ����һ���µ�ʵ�� OpenCommand.
	*
	* @param mainBoardApi
	 */
	public ResetCommand(MainBoardApi mainBoardApi) {
		this.mainBoardApi = mainBoardApi;
	}
	
	/**
	 * ͨ��������������
	 */
	@Override
	public void execute() {
		mainBoardApi.reset();
	}

}
