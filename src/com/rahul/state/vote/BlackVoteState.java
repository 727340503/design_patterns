package com.rahul.state.vote;

public class BlackVoteState implements VoteState{

	@Override
	public void vote(String user, VoteManager manager, String voteItem) {
		System.out.println(user + "进入黑名单");
	}

}
