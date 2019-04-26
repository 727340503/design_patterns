package com.rahul.state.votebystateclass;

public class SpiteVoteState implements VoteState{

	@Override
	public void vote(String user, String voteItem, VoteManager manager) {
		System.out.println("¶ñÒâË¢Æ±");
		manager.getMapVote().remove(user);
		if(manager.getMapVoteCount().get(user) >= 7) {
			manager.getUserVoteMap().put(user, new BlackVoteState());
		}
	}

}
