package com.rahul.state.vote;

public interface VoteState {
	void vote(String user, VoteManager manager, String voteItem);
}
