package com.rahul.interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * ���ս���ʽ
 * @author RahulRui
 *
 */
public class NonterminalExpression extends AbstractExpression{

	private List<AbstractExpression> list = new ArrayList<AbstractExpression>();
	
	public void add(AbstractExpression exp) {
		list.add(exp);
	}
	
	@Override
	public void interpret(Context ctx) {
		//ʵ���﷨�з��ս����صĽ��Ͳ���
	}

}
