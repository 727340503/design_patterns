package com.rahul.examplel;

/**
 * �����Ŀ����󣬸�����й�״̬���뵽��Ӧ�Ĺ۲��߶���
* @ClassName: ConcreateSubject
* @Description: TODO(������һ�仰��������������)
* @author rahul
* @date 2018��9��4��
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
		 * ״̬�����ı�ʱ��֪ͨ���еĹ۲���
		 */
		this.notifiObserver();
	}

}
