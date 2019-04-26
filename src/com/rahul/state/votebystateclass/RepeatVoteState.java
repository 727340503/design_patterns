package com.rahul.state.votebystateclass;

public class RepeatVoteState implements VoteState{

	@Override
	public void vote(String user, String voteItem, VoteManager manager) {
		System.out.println("�벻Ҫ�ظ�ˢƱ");
		if(manager.getMapVoteCount().get(user) >= 4) {
			manager.getUserVoteMap().put(user, new SpiteVoteState());
		}
	}

}
