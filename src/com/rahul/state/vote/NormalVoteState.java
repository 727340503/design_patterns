package com.rahul.state.vote;

public class NormalVoteState implements VoteState{

	@Override
	public void vote(String user, VoteManager manager, String voteItem) {
		System.out.println("����ͶƱ");
		manager.getMapVote().put(user, voteItem);
	}

}
