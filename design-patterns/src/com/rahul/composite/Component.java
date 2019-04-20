package com.rahul.composite;

/**
 * 抽象的组件对象，为组合中的对象声明接口，实现接口的缺省行为
* @ClassName: Component
* @Description: TODO(这里用一句话描述这个类的作用)
* @author rahul
* @date 2018年9月13日
*
 */
public abstract class Component {

	/**
	 * 示意方法，子组件对象可能有的功能方法
	 * @author rahul.rui
	 * @date 2018年9月13日
	 * @return void
	 *
	 */
	public abstract void somOperation();
	
	public void addChild(Component child) {
		//缺省实现，抛出异常，因为叶子对象没有这个功能，或者子组件没有实现这个功能。
		throw new UnsupportedOperationException("对象不支持这个功能");
	}
	
	public void removeChild(Component child) {
		//缺省实现，抛出异常，因为叶子对象没有这个功能，或者子组件没有实现这个功能。
		throw new UnsupportedOperationException("对象不支持这个功能");
	}
	
	public Component getChild(int index) {
		//缺省实现，抛出异常，因为叶子对象没有这个功能，或者子组件没有实现这个功能。
		throw new UnsupportedOperationException("对象不支持这个功能");
	}
}
