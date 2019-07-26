package com.rahul.interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * 非终结表达式
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
		//实现语法中非终结符相关的解释操作
	}

}
