package com.rahul.command.computerreset;

public class MsiMainBoard implements MainBoardApi{

	@Override
	public void open() {
		System.out.println("΢�����忪��.......");
	}

	@Override
	public void reset() {
		System.out.println("΢������������.......");
	}

}
