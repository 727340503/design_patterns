package com.rahul.command.cookingqueueserialiszble;

import java.util.ArrayList;
import java.util.List;
/**
 * ���������
* @ClassName: MenuCommand
* @Description: TODO(������һ�仰��������������)
* @author rahul
* @date 2018��9��7��
*
 */
public class MenuCommand implements Command{

	private List<Command> comms = new ArrayList<Command>();
	
	public List<Command> getComms() {
		return comms;
	}

	public void addComms(Command comm) {
		comms.add(comm);
	}
	
	@Override
	public void execute() {
		CommandQueue.addMenu(this);
	}

	@Override
	public void setCookApi(CookApi api) {
		
	}

	@Override
	public int getTableNum() {
		return 0;
	}

}
