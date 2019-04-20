package com.rahul.command.computerreset;

public class MsiMainBoard implements MainBoardApi{

	@Override
	public void open() {
		System.out.println("微星主板开机.......");
	}

	@Override
	public void reset() {
		System.out.println("微星主板重启中.......");
	}

}
