package com.rahul.command.cooking;

public class CoolCook implements CookApi{

	@Override
	public void cook(String name) {
		System.out.println("凉菜师傅在做的"+name);
	}

}
