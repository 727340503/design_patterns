package com.rahul.composite.fuzhuang;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Compont{
	
	private List<Compont> childs;
	
	private String name;
	
	public Composite(String name) {
		this.name = name;
		
		childs = new ArrayList<Compont>();
	}

	@Override
	public void printStruct(String struct) {
		System.out.println(struct + "+" + this.name);
		
		struct += " ";
		for(Compont child : childs) {
			child.printStruct(struct);
		}
	}
	
	public void addChild(Compont child) {
		childs.add(child);
	}
	
	public void removeChild(Compont child) {
		childs.remove(child);
	}
	
	public Compont getChild(int index) {
		if(index >= 0 && index < childs.size()) {
			return childs.get(index);
		}
		
		return null;
	}

}
