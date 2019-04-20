package com.rahul.command.cooking;

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
	
	public void addComms(Command comm) {
		comms.add(comm);
	}
	
	@Override
	public void execute() {
		comms.stream().forEach(comm -> comm.execute());
	}

}
