package com.rahul.state.votebystateclass;

public class BlackVoteState implements VoteState{

	@Override
	public void vote(String user, String voteItem, VoteManager manager) {
		System.out.println(user + "进入黑名单");
	}

}
