package com.rahul.templatemethod.jieshi;

public abstract class AbstractTemplate {
	
	/**
	 * 模板方法，定义骨架的算法
	 * @author rahul.rui
	 * @date 2018年9月18日
	 * @return void
	 *
	 */
	public final void templateMethod() {
		//第一步骤
		this.operation1();
		//第二步骤
		this.operation2();
		//第三步骤
		this.doPrimitiveOperation();
		//第四步骤
		this.hookOperation();
	}
	
	/**
	 * 具体操作，子类不需要访问
	 * @author rahul.rui
	 * @date 2018年9月18日
	 * @return void
	 *
	 */
	private void operation1() {
		
	}
	
	/**
	 * 具体操作，算法中的步骤，固定实现，子类可能需要访问
	 * @author rahul.rui
	 * @date 2018年9月18日
	 * @return void
	 *
	 */
	protected final void operation2() {
		
	}
	
	/**
	 * 具体的抽象类方法，子类的公共的功能，主要提供给子类使用
	 * @author rahul.rui
	 * @date 2018年9月18日
	 * @return void
	 *
	 */
	protected void commonOperation() {
		
	}
	
	
	/**
	 * 原语方法，算法中必要的步骤，父类无法确定如何实现，需要子类来实现
	 * @author rahul.rui
	 * @date 2018年9月18日
	 * @return void
	 *
	 */
	protected abstract void doPrimitiveOperation();

	/**
	 * 钩子方法，算法中的步骤，不一定需要，提供默认实现
	 * 子类可以使用父类的钩子方法，可以以自己实现
	 * @author rahul.rui
	 * @date 2018年9月18日
	 * @return void
	 *
	 */
	protected void hookOperation() {
		
	}
}
