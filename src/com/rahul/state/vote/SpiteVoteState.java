package com.rahul.state.vote;

public class SpiteVoteState implements VoteState{

	@Override
	public void vote(String user, VoteManager manager, String voteItem) {
		System.out.println("∂Ò“‚À¢∆±");
		manager.getMapVote().remove(user);
	}

}
