package com.rahul.state.vote;

public class RepeatVoteState implements VoteState{

	@Override
	public void vote(String user, VoteManager manager, String voteItem) {
		System.out.println("�벻Ҫ�ظ�ˢƱ");
	}

}
