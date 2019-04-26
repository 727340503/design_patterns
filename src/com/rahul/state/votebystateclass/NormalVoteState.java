package com.rahul.state.votebystateclass;

public class NormalVoteState implements VoteState{

	@Override
	public void vote(String user, String voteItem, VoteManager manager) {
		System.out.println("Õý³£Í¶Æ±");
		manager.getMapVote().put(user, voteItem);
		manager.getUserVoteMap().put(user, new RepeatVoteState());
	}

}
