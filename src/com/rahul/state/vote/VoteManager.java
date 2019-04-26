package com.rahul.state.vote;

import java.util.HashMap;
import java.util.Map;

public class VoteManager {
	
	private VoteState state;
	
	private Map<String, String> mapVote = new HashMap<String, String>();
	
	private Map<String, Integer> mapVoteCount = new HashMap<String, Integer>();
	
	public Map<String, Integer> getMapVoteCount(){
		return this.mapVoteCount;
	}
	
	public Map<String, String> getMapVote(){
		return this.mapVote;
	}
	
	public void vote(String user,String voteItem) {
		Integer count = mapVoteCount.get(user);
		if(null == count) {
			count = 0;
		}
		count += 1;
		mapVoteCount.put(user, count);
		
		if(count == 1) {
			state = new NormalVoteState();
		}else if(count >1 && count < 5) {
			state = new RepeatVoteState();
		}else if(count >= 5 && count < 8) {
			state = new SpiteVoteState();
		}else if(count >= 8) {
			state = new BlackVoteState();
		}
		
		state.vote(user, this, voteItem);
		
	}

}
