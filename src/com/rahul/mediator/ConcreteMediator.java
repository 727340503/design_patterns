package com.rahul.mediator;

public class ConcreteMediator implements Mediator{

	private ConcreteColleagueA colleagueA;
	private ConcreteColleagueB colleagueB;
	/**
	 * �O���н�����Ҫ�������S�o��ͬ��A����
	 * @author rahul.rui
	 * @date 2018��8��6��
	 * @param colleagueA
	 * @return void
	 *
	 */
	public void setColleagueA(ConcreteColleagueA colleagueA) {
		this.colleagueA = colleagueA;
	}
	/**
	 * �O���н�����Ҫ�������S�o��ͬ��B����
	 * @author rahul.rui
	 * @date 2018��8��6��
	 * @param colleagueA
	 * @return void
	 *
	 */
	public void setColleagueB(ConcreteColleagueB colleagueB) {
		this.colleagueB = colleagueB;
	}

	@Override
	public void changed(Colleague colleague) {
		//ĳ��ͬ��l����׃����ͨ����Ҫ�c����ͬ�½���
		//���w�f�{������ͬ����팍�F�f�����E
	}
	
}
