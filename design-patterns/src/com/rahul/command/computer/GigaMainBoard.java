package com.rahul.command.computer;

/**
 * 技嘉主板类，开机命令真正实现者
* @ClassName: GigaMainBoard
* @Description: TODO(这里用一句话描述这个类的作用)
* @author rahul
* @date 2018年9月6日
*
 */
public class GigaMainBoard implements MainBoardApi{

	@Override
	public void open() {
		System.out.println("技嘉主板现在开机.......");
		System.out.println("接通电源.......");
	}

}
