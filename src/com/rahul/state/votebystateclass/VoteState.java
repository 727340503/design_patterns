package com.rahul.state.votebystateclass;

public interface VoteState {
	void vote(String user, String voteItem, VoteManager manager);
}
