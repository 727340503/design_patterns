package com.rahul.state.vote;

public class NormalVoteState implements VoteState{

	@Override
	public void vote(String user, VoteManager manager, String voteItem) {
		System.out.println("Õý³£Í¶Æ±");
		manager.getMapVote().put(user, voteItem);
	}

}
