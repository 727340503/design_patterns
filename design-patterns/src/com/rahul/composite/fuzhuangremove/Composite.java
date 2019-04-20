package com.rahul.composite.fuzhuangremove;

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
		
		if(null != child) {
			child.setParent(this);
			
			childs.add(child);
		}
		
	}
	
	public void removeChild(Compont child) {
		
		int index = childs.indexOf(child);
		if(index != -1) {
			
			List<Compont> childrens = child.getChildren();
			for(Compont com : childrens) {
				com.setParent(this);
			
				this.childs.add(com);
			}
			
			childs.remove(child);
		}
	}
	
	public List<Compont> getChildren() {
		return this.childs;
	}
	
	public Compont getChild(int index) {
		if(index >= 0 && index < childs.size()) {
			return childs.get(index);
		}
		
		return null;
	}

}
