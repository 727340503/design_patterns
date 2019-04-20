package com.rahul.adapter.twoway;

public class LogModel {
	
	private Long id;
	private String log;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLog() {
		return log;
	}

	public void setLog(String log) {
		this.log = log;
	}

	@Override
	public String toString() {
		return "LogModel [id=" + id + ", log=" + log + "]";
	}
	
	

}
