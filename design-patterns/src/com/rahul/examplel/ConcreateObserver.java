package com.rahul.examplel;

public class ConcreateObserver implements Observer{
	/**
	 * �۲���״̬��ʾ���ֶΣ������Ǿ����ҵ���ֶ�
	 */
	private String observerStatus;

	@Override
	public void update(Subject subject) {
		observerStatus = ( (ConcreateSubject) subject).getSubjectStatus();
		System.out.println(observerStatus);
	}
	
	
}
