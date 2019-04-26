package com.rahul.state.votebystateclass;

public class Client {
	
	public static void main(String[] args) {
		VoteManager manager = new VoteManager();
		for(int i=0; i<9; i++) {
			manager.vote("zhangsan", "lisi");
		}
		
		System.out.println(manager.getMapVote());
	}
	
}
