package com.rahul.interpreter;

/**
 * ������ʽ=====>��϶��󣬿����ǽӿ�
 * @author RahulRui
 *
 */
public abstract class AbstractExpression {
	
	/**
	 * ���Ͳ���
	 * @param ctx
	 */
	abstract void interpret(Context ctx);
	
}
