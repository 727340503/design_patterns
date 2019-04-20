package com.rahul.command.cooking;

import java.util.ArrayList;
import java.util.List;
/**
 * 宏命令对象
* @ClassName: MenuCommand
* @Description: TODO(这里用一句话描述这个类的作用)
* @author rahul
* @date 2018年9月7日
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
