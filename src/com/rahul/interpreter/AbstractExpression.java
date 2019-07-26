package com.rahul.interpreter;

/**
 * 抽象表达式=====>组合对象，可以是接口
 * @author RahulRui
 *
 */
public abstract class AbstractExpression {
	
	/**
	 * 解释操作
	 * @param ctx
	 */
	abstract void interpret(Context ctx);
	
}
