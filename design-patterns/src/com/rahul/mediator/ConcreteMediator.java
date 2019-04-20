package com.rahul.mediator;

public class ConcreteMediator implements Mediator{

	private ConcreteColleagueA colleagueA;
	private ConcreteColleagueB colleagueB;
	/**
	 * 設置中介者需要樂基并維護的同事A對象
	 * @author rahul.rui
	 * @date 2018年8月6日
	 * @param colleagueA
	 * @return void
	 *
	 */
	public void setColleagueA(ConcreteColleagueA colleagueA) {
		this.colleagueA = colleagueA;
	}
	/**
	 * 設置中介者需要樂基并維護的同事B對象
	 * @author rahul.rui
	 * @date 2018年8月6日
	 * @param colleagueA
	 * @return void
	 *
	 */
	public void setColleagueB(ConcreteColleagueB colleagueB) {
		this.colleagueB = colleagueB;
	}

	@Override
	public void changed(Colleague colleague) {
		//某個同事類發生了變化，通常需要與其他同事交互
		//具體協調相應的同事對象來實現協作步驟
	}
	
}
