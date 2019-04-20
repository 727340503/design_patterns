package com.rahul.command.cooking;

public class HotCook implements CookApi{

	@Override
	public void cook(String name) {
		System.out.println("热菜师傅正在做"+name);
	}

}
