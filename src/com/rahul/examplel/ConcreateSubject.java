package com.rahul.examplel;

/**
 * 具体的目标对象，负责把有关状态存入到相应的观察者对象
* @ClassName: ConcreateSubject
* @Description: TODO(这里用一句话描述这个类的作用)
* @author rahul
* @date 2018年9月4日
*
 */
public class ConcreateSubject extends Subject {
	private String subjectStatus;

	public String getSubjectStatus() {
		return subjectStatus;
	}

	public void setSubjectStatus(String subjectStatus) {
		this.subjectStatus = subjectStatus;
		/**
		 * 状态发生改变时，通知所有的观察者
		 */
		this.notifiObserver();
	}

}
