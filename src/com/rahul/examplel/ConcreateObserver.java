package com.rahul.examplel;

public class ConcreateObserver implements Observer{
	/**
	 * 观察者状态，示意字段，可以是具体的业务字段
	 */
	private String observerStatus;

	@Override
	public void update(Subject subject) {
		observerStatus = ( (ConcreateSubject) subject).getSubjectStatus();
		System.out.println(observerStatus);
	}
	
	
}
