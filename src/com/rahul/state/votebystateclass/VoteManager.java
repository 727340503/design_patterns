package com.rahul.state.votebystateclass;

import java.util.HashMap;
import java.util.Map;


public class VoteManager {
	
	private Map<String, VoteState> userStateMap = new HashMap<String, VoteState>();
	
	private Map<String, String> mapVote = new HashMap<String, String>();
	
	private Map<String, Integer> mapVoteCount = new HashMap<String, Integer>();
	
	public Map<String, Integer> getMapVoteCount(){
		return this.mapVoteCount;
	}
	
	public Map<String, String> getMapVote(){
		return this.mapVote;
	}
	
	public Map<String, VoteState> getUserVoteMap(){
		return this.userStateMap;
	}
	
	public void vote(String user,String voteItem) {
		Integer count = mapVoteCount.get(user);
		if(null == count) {
			count = 0;
		}
		count += 1;
		mapVoteCount.put(user, count);
		
		VoteState userState = userStateMap.get(user);
		if(null == userState) {
			userState = new NormalVoteState();
			userStateMap.put(user, userState);
		}
		
		userState.vote(user, voteItem, this);
		
	}

}
