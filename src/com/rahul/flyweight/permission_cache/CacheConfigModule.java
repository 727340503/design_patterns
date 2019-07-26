package com.rahul.flyweight.permission_cache;

public class CacheConfigModule {

	private Long beginTime;

	private double durableTime;

	private boolean isForver;

	public Long getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(Long beginTime) {
		this.beginTime = beginTime;
	}

	public double getDurableTime() {
		return durableTime;
	}

	public void setDurableTime(double durableTime) {
		this.durableTime = durableTime;
	}

	public boolean isForver() {
		return isForver;
	}

	public void setForver(boolean isForver) {
		this.isForver = isForver;
	}

}
