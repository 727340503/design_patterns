package com.rahul.composite.nodesign;

import java.util.ArrayList;
import java.util.List;

public class Composite {
	
	private List<Composite> childs;
	
	private List<Leaf> leafs;
	
	private String name;
	
	public Composite(String name) {
		this.name = name;
		childs = new ArrayList<Composite>();
		leafs = new ArrayList<Leaf>();
	}
	
	public void addChild(Composite child) {
		this.childs.add(child);
	}
	
	public void addLeaf(Leaf leaf){
		this.leafs.add(leaf);
	}
	
	public void printStruct(String struct) {
		System.out.println(struct + "-" + this.name);
		
		struct = struct+" ";
		for(Composite child : childs) {
			child.printStruct(struct);
		}
		
		for(Leaf leaf : leafs) {
			leaf.printStruct(struct);
		}
	}
	
}
